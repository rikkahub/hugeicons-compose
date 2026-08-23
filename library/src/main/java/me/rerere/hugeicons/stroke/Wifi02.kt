package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wifi02: ImageVector
    get() {
        if (_wifi02 != null) {
            return _wifi02!!
        }
        _wifi02 = ImageVector.Builder(
            name = "Wifi02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 8.31966f)
            curveTo(4.75011f, 5.85989f, 8.31034f, 4.5f, 12f, 4.5f)
            curveTo(15.6897f, 4.5f, 19.2499f, 5.85989f, 22f, 8.31966f)
            moveTo(5f, 12.3587f)
            curveTo(6.86929f, 10.5264f, 9.38247f, 9.50009f, 12f, 9.50009f)
            curveTo(14.6175f, 9.50009f, 17.1307f, 10.5264f, 19f, 12.3587f)
            moveTo(8.5f, 15.9287f)
            curveTo(9.43464f, 15.0125f, 10.6912f, 14.4994f, 12f, 14.4994f)
            curveTo(13.3088f, 14.4994f, 14.5654f, 15.0125f, 15.5f, 15.9287f)
            moveTo(12.1256f, 19.25f)
            horizontalLineTo(12.0006f)
            moveTo(12.2506f, 19.25f)
            curveTo(12.2506f, 19.3881f, 12.1387f, 19.5f, 12.0006f, 19.5f)
            curveTo(11.8625f, 19.5f, 11.7506f, 19.3881f, 11.7506f, 19.25f)
            curveTo(11.7506f, 19.1119f, 11.8625f, 19f, 12.0006f, 19f)
            curveTo(12.1387f, 19f, 12.2506f, 19.1119f, 12.2506f, 19.25f)
            close()
        }
        }.build()

        return _wifi02!!
    }

private var _wifi02: ImageVector? = null
