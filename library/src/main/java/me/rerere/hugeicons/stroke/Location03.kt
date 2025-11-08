package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Location03: ImageVector
    get() {
        if (_location03 != null) {
            return _location03!!
        }
        _location03 = ImageVector.Builder(
            name = "Location03",
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
        moveTo(18.2222f, 17f)
        curveTo(19.6167f, 18.9885f, 20.2838f, 20.0475f, 19.8865f, 20.8999f)
        curveTo(19.8466f, 20.9854f, 19.7999f, 21.0679f, 19.7469f, 21.1467f)
        curveTo(19.1724f, 22f, 17.6875f, 22f, 14.7178f, 22f)
        horizontalLineTo(9.28223f)
        curveTo(6.31251f, 22f, 4.82765f, 22f, 4.25311f, 21.1467f)
        curveTo(4.20005f, 21.0679f, 4.15339f, 20.9854f, 4.11355f, 20.8999f)
        curveTo(3.71619f, 20.0475f, 4.38326f, 18.9885f, 5.77778f, 17f)
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

        return _location03!!
    }

private var _location03: ImageVector? = null
