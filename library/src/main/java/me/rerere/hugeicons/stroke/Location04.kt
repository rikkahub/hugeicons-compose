package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Location04: ImageVector
    get() {
        if (_location04 != null) {
            return _location04!!
        }
        _location04 = ImageVector.Builder(
            name = "Location04",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 18f)
        curveTo(5.17107f, 18.4117f, 4f, 19.0443f, 4f, 19.7537f)
        curveTo(4f, 20.9943f, 7.58172f, 22f, 12f, 22f)
        curveTo(16.4183f, 22f, 20f, 20.9943f, 20f, 19.7537f)
        curveTo(20f, 19.0443f, 18.8289f, 18.4117f, 17f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 9f)
        curveTo(14.5f, 10.3807f, 13.3807f, 11.5f, 12f, 11.5f)
        curveTo(10.6193f, 11.5f, 9.5f, 10.3807f, 9.5f, 9f)
        curveTo(9.5f, 7.61929f, 10.6193f, 6.5f, 12f, 6.5f)
        curveTo(13.3807f, 6.5f, 14.5f, 7.61929f, 14.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.2574f, 17.4936f)
        curveTo(12.9201f, 17.8184f, 12.4693f, 18f, 12.0002f, 18f)
        curveTo(11.531f, 18f, 11.0802f, 17.8184f, 10.7429f, 17.4936f)
        curveTo(7.6543f, 14.5008f, 3.51519f, 11.1575f, 5.53371f, 6.30373f)
        curveTo(6.6251f, 3.67932f, 9.24494f, 2f, 12.0002f, 2f)
        curveTo(14.7554f, 2f, 17.3752f, 3.67933f, 18.4666f, 6.30373f)
        curveTo(20.4826f, 11.1514f, 16.3536f, 14.5111f, 13.2574f, 17.4936f)
        }
        }.build()

        return _location04!!
    }

private var _location04: ImageVector? = null
