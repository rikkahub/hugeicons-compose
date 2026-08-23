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

val HugeIcons.RamadhanMonth: ImageVector
    get() {
        if (_ramadhanMonth != null) {
            return _ramadhanMonth!!
        }
        _ramadhanMonth = ImageVector.Builder(
            name = "RamadhanMonth",
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
            moveTo(16f, 2f)
            verticalLineTo(6f)
            moveTo(8f, 2f)
            verticalLineTo(6f)
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
            moveTo(13f, 4f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
            curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
            verticalLineTo(14f)
            curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
            curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8284f)
            curveTo(21f, 19.6569f, 21f, 17.7712f, 21f, 14f)
            verticalLineTo(12f)
            curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
            curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
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
            moveTo(3f, 10f)
            horizontalLineTo(21f)
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
            moveTo(14f, 17.1952f)
            curveTo(13.5289f, 17.9771f, 12.6717f, 18.5f, 11.6923f, 18.5f)
            curveTo(10.2054f, 18.5f, 9f, 17.2946f, 9f, 15.8077f)
            curveTo(9f, 14.8283f, 9.52292f, 13.9711f, 10.3048f, 13.5f)
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
            moveTo(13.625f, 14f)
            horizontalLineTo(13.5f)
            moveTo(13.75f, 14f)
            curveTo(13.75f, 14.1381f, 13.6381f, 14.25f, 13.5f, 14.25f)
            curveTo(13.3619f, 14.25f, 13.25f, 14.1381f, 13.25f, 14f)
            curveTo(13.25f, 13.8619f, 13.3619f, 13.75f, 13.5f, 13.75f)
            curveTo(13.6381f, 13.75f, 13.75f, 13.8619f, 13.75f, 14f)
            close()
        }
        }.build()

        return _ramadhanMonth!!
    }

private var _ramadhanMonth: ImageVector? = null
