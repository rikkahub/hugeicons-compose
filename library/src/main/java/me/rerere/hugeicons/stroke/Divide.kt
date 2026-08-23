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

val HugeIcons.Divide: ImageVector
    get() {
        if (_divide != null) {
            return _divide!!
        }
        _divide = ImageVector.Builder(
            name = "Divide",
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
            moveTo(5f, 12f)
            horizontalLineTo(19f)
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
            moveTo(12f, 17.875f)
            verticalLineTo(18.25f)
            moveTo(12.75f, 18.25f)
            curveTo(12.75f, 18.6642f, 12.4142f, 19f, 12f, 19f)
            curveTo(11.5858f, 19f, 11.25f, 18.6642f, 11.25f, 18.25f)
            curveTo(11.25f, 17.8358f, 11.5858f, 17.5f, 12f, 17.5f)
            curveTo(12.4142f, 17.5f, 12.75f, 17.8358f, 12.75f, 18.25f)
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
            moveTo(12f, 5.375f)
            verticalLineTo(5.75f)
            moveTo(12.75f, 5.75f)
            curveTo(12.75f, 6.16421f, 12.4142f, 6.5f, 12f, 6.5f)
            curveTo(11.5858f, 6.5f, 11.25f, 6.16421f, 11.25f, 5.75f)
            curveTo(11.25f, 5.33579f, 11.5858f, 5f, 12f, 5f)
            curveTo(12.4142f, 5f, 12.75f, 5.33579f, 12.75f, 5.75f)
            close()
        }
        }.build()

        return _divide!!
    }

private var _divide: ImageVector? = null
