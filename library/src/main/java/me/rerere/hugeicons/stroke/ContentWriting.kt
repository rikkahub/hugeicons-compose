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

val HugeIcons.ContentWriting: ImageVector
    get() {
        if (_contentWriting != null) {
            return _contentWriting!!
        }
        _contentWriting = ImageVector.Builder(
            name = "ContentWriting",
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
            moveTo(14.4862f, 22f)
            horizontalLineTo(13.0005f)
            verticalLineTo(20.5142f)
            curveTo(13.0005f, 20.0427f, 13.1878f, 19.5905f, 13.5211f, 19.2571f)
            lineTo(18.388f, 14.3905f)
            curveTo(18.9087f, 13.8698f, 19.7528f, 13.8698f, 20.2734f, 14.3905f)
            lineTo(20.61f, 14.7271f)
            curveTo(21.1306f, 15.2478f, 21.1306f, 16.092f, 20.61f, 16.6127f)
            lineTo(15.7431f, 21.4793f)
            curveTo(15.4098f, 21.8127f, 14.9576f, 22f, 14.4862f, 22f)
            close()
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
            moveTo(19.0005f, 10f)
            verticalLineTo(9f)
            curveTo(19.0005f, 5.70017f, 19.0005f, 4.05025f, 17.9754f, 3.02513f)
            curveTo(16.9502f, 2f, 15.3003f, 2f, 12.0005f, 2f)
            horizontalLineTo(10.0005f)
            curveTo(6.70066f, 2f, 5.05074f, 2f, 4.02561f, 3.02513f)
            curveTo(3.00049f, 4.05025f, 3.00049f, 5.70017f, 3.00049f, 9f)
            verticalLineTo(16f)
            curveTo(3.00049f, 18.3389f, 3.00049f, 19.5083f, 3.53695f, 20.3621f)
            curveTo(3.8167f, 20.8073f, 4.19316f, 21.1838f, 4.63838f, 21.4635f)
            curveTo(5.49216f, 22f, 6.6616f, 22f, 9.00049f, 22f)
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
            moveTo(11.0005f, 6f)
            horizontalLineTo(15.0005f)
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
            moveTo(7.00049f, 10f)
            horizontalLineTo(15.0005f)
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
            moveTo(7.00049f, 14f)
            horizontalLineTo(13.0005f)
        }
        }.build()

        return _contentWriting!!
    }

private var _contentWriting: ImageVector? = null
