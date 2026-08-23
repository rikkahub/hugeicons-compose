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

val HugeIcons.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = ImageVector.Builder(
            name = "Plug",
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
            moveTo(8.99219f, 2f)
            verticalLineTo(7f)
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
            moveTo(14.9922f, 2f)
            verticalLineTo(7f)
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
            moveTo(11.9922f, 18f)
            verticalLineTo(22f)
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
            moveTo(4.99219f, 7f)
            horizontalLineTo(18.9922f)
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
            moveTo(5.99219f, 7f)
            verticalLineTo(10f)
            curveTo(5.99219f, 11.5913f, 6.36697f, 12.8748f, 7.49219f, 14f)
            curveTo(7.65233f, 14.1601f, 7.76562f, 14.3859f, 7.84506f, 14.6545f)
            curveTo(8.30611f, 16.2131f, 8.53663f, 16.9924f, 8.83026f, 17.3246f)
            curveTo(9.05337f, 17.577f, 9.17826f, 17.6703f, 9.48358f, 17.8127f)
            curveTo(9.88539f, 18f, 10.3743f, 18f, 11.3522f, 18f)
            horizontalLineTo(12.6322f)
            curveTo(13.6498f, 18f, 14.1586f, 18f, 14.5762f, 17.7945f)
            curveTo(14.8784f, 17.6458f, 15.0317f, 17.5238f, 15.2443f, 17.2625f)
            curveTo(15.5381f, 16.9015f, 15.7109f, 16.1498f, 16.0564f, 14.6464f)
            curveTo(16.0987f, 14.462f, 16.1566f, 14.3208f, 16.2348f, 14.2426f)
            curveTo(17.36f, 13.1174f, 17.9922f, 11.5913f, 17.9922f, 10f)
            verticalLineTo(7f)
            horizontalLineTo(5.99219f)
            close()
        }
        }.build()

        return _plug!!
    }

private var _plug: ImageVector? = null
