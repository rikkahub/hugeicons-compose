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

val HugeIcons.ShelvingUnit: ImageVector
    get() {
        if (_shelvingUnit != null) {
            return _shelvingUnit!!
        }
        _shelvingUnit = ImageVector.Builder(
            name = "ShelvingUnit",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.99219f, 3f)
            verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.99219f, 12f)
            horizontalLineTo(18.9922f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.9922f, 3f)
            verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.99219f, 5f)
            horizontalLineTo(18.9922f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.99219f, 19f)
            horizontalLineTo(18.9922f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.9922f, 17f)
            curveTo(11.9922f, 16.0572f, 11.9922f, 15.5858f, 12.2851f, 15.2929f)
            curveTo(12.578f, 15f, 13.0494f, 15f, 13.9922f, 15f)
            curveTo(14.935f, 15f, 15.4064f, 15f, 15.6993f, 15.2929f)
            curveTo(15.9922f, 15.5858f, 15.9922f, 16.0572f, 15.9922f, 17f)
            verticalLineTo(19f)
            horizontalLineTo(11.9922f)
            verticalLineTo(17f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.99219f, 10f)
            curveTo(7.99219f, 9.05719f, 7.99219f, 8.58579f, 8.28508f, 8.29289f)
            curveTo(8.57797f, 8f, 9.04938f, 8f, 9.99219f, 8f)
            curveTo(10.935f, 8f, 11.4064f, 8f, 11.6993f, 8.29289f)
            curveTo(11.9922f, 8.58579f, 11.9922f, 9.05719f, 11.9922f, 10f)
            verticalLineTo(12f)
            horizontalLineTo(7.99219f)
            verticalLineTo(10f)
            close()
        }
        }.build()

        return _shelvingUnit!!
    }

private var _shelvingUnit: ImageVector? = null
