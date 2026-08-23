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

val HugeIcons.CircleDivide: ImageVector
    get() {
        if (_circleDivide != null) {
            return _circleDivide!!
        }
        _circleDivide = ImageVector.Builder(
            name = "CircleDivide",
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
            moveTo(12f, 22f)
            curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
            curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
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
            moveTo(12f, 7.375f)
            verticalLineTo(7.5f)
            moveTo(12.25f, 7.5f)
            curveTo(12.25f, 7.63807f, 12.1381f, 7.75f, 12f, 7.75f)
            curveTo(11.8619f, 7.75f, 11.75f, 7.63807f, 11.75f, 7.5f)
            curveTo(11.75f, 7.36193f, 11.8619f, 7.25f, 12f, 7.25f)
            curveTo(12.1381f, 7.25f, 12.25f, 7.36193f, 12.25f, 7.5f)
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
            moveTo(12f, 16.375f)
            verticalLineTo(16.5f)
            moveTo(12.25f, 16.5f)
            curveTo(12.25f, 16.6381f, 12.1381f, 16.75f, 12f, 16.75f)
            curveTo(11.8619f, 16.75f, 11.75f, 16.6381f, 11.75f, 16.5f)
            curveTo(11.75f, 16.3619f, 11.8619f, 16.25f, 12f, 16.25f)
            curveTo(12.1381f, 16.25f, 12.25f, 16.3619f, 12.25f, 16.5f)
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
            moveTo(8f, 12f)
            horizontalLineTo(16f)
        }
        }.build()

        return _circleDivide!!
    }

private var _circleDivide: ImageVector? = null
