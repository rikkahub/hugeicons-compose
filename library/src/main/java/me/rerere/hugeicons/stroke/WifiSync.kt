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

val HugeIcons.WifiSync: ImageVector
    get() {
        if (_wifiSync != null) {
            return _wifiSync!!
        }
        _wifiSync = ImageVector.Builder(
            name = "WifiSync",
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
            moveTo(2f, 7.81966f)
            curveTo(4.75011f, 5.35989f, 8.31034f, 4f, 12f, 4f)
            curveTo(15.6897f, 4f, 19.2499f, 5.35989f, 22f, 7.81966f)
            moveTo(5f, 11.8587f)
            curveTo(6.38599f, 10.5001f, 8.12597f, 9.58466f, 10f, 9.20209f)
            moveTo(8.5f, 15.4287f)
            curveTo(8.93844f, 14.9989f, 9.44772f, 14.6578f, 10f, 14.4168f)
        }

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
            moveTo(21.4649f, 13.5f)
            curveTo(20.7733f, 12.3044f, 19.4806f, 11.5f, 18f, 11.5f)
            curveTo(16.4726f, 11.5f, 15.1451f, 12.3561f, 14.4713f, 13.6147f)
            moveTo(14.5351f, 17.5f)
            curveTo(15.2267f, 18.6956f, 16.5194f, 19.5f, 18f, 19.5f)
            curveTo(19.5227f, 19.5f, 20.8467f, 18.6492f, 21.5224f, 17.397f)
            moveTo(17f, 14f)
            horizontalLineTo(16f)
            curveTo(15.0572f, 14f, 14.5858f, 14f, 14.2929f, 13.7071f)
            curveTo(14f, 13.4142f, 14f, 12.9428f, 14f, 12f)
            verticalLineTo(11f)
            moveTo(19f, 17f)
            horizontalLineTo(20f)
            curveTo(20.9428f, 17f, 21.4142f, 17f, 21.7071f, 17.2929f)
            curveTo(22f, 17.5858f, 22f, 18.0572f, 22f, 19f)
            verticalLineTo(20f)
        }
        }.build()

        return _wifiSync!!
    }

private var _wifiSync: ImageVector? = null
