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

val HugeIcons.PropertyNew: ImageVector
    get() {
        if (_propertyNew != null) {
            return _propertyNew!!
        }
        _propertyNew = ImageVector.Builder(
            name = "PropertyNew",
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
            moveTo(3.00008f, 11.9999f)
            curveTo(3.00008f, 7.75727f, 3.00008f, 5.63595f, 4.3181f, 4.31793f)
            curveTo(5.63612f, 2.99991f, 7.75744f, 2.99991f, 12.0001f, 2.99991f)
            curveTo(16.2427f, 2.99991f, 18.364f, 2.99991f, 19.6821f, 4.31793f)
            curveTo(21.0001f, 5.63595f, 21.0001f, 7.75727f, 21.0001f, 11.9999f)
            curveTo(21.0001f, 16.2426f, 21.0001f, 18.3639f, 19.6821f, 19.6819f)
            curveTo(18.364f, 20.9999f, 16.2427f, 20.9999f, 12.0001f, 20.9999f)
            curveTo(7.75744f, 20.9999f, 5.63612f, 20.9999f, 4.3181f, 19.6819f)
            curveTo(3.00008f, 18.3639f, 3.00008f, 16.2426f, 3.00008f, 11.9999f)
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
            moveTo(3.50008f, 7.99991f)
            horizontalLineTo(20.5001f)
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
            moveTo(12.0001f, 16.4999f)
            horizontalLineTo(17.0001f)
            moveTo(7.00008f, 16.4999f)
            horizontalLineTo(8.00008f)
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
            moveTo(12.0001f, 12.4999f)
            horizontalLineTo(17.0001f)
            moveTo(7.00008f, 12.4999f)
            horizontalLineTo(8.00008f)
        }
        }.build()

        return _propertyNew!!
    }

private var _propertyNew: ImageVector? = null
