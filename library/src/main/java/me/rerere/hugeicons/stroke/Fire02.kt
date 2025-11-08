package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fire02: ImageVector
    get() {
        if (_fire02 != null) {
            return _fire02!!
        }
        _fire02 = ImageVector.Builder(
            name = "Fire02",
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
        moveTo(12f, 22f)
        curveTo(16.1421f, 22f, 19.5f, 18.6421f, 19.5f, 14.5f)
        curveTo(19.5f, 13.5f, 19.5f, 11.5f, 17.5f, 9f)
        curveTo(17.5f, 9f, 17.4004f, 11.8536f, 15.4262f, 11.4408f)
        curveTo(12.2331f, 10.7732f, 16.3551f, 4.50296f, 10.5f, 2f)
        curveTo(10.5f, 7f, 4.5f, 8.5f, 4.5f, 14.5f)
        curveTo(4.5f, 18.6421f, 7.85786f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19.0011f)
        curveTo(13.933f, 19.0011f, 15.5f, 16.9864f, 15.5f, 14.5011f)
        curveTo(12.3f, 15.7011f, 11.1667f, 12.9379f, 11f, 11f)
        curveTo(9.55426f, 11.5532f, 8.5f, 13.8256f, 8.5f, 15f)
        curveTo(8.5f, 17.4853f, 10.067f, 19.0011f, 12f, 19.0011f)
        }
        }.build()

        return _fire02!!
    }

private var _fire02: ImageVector? = null
