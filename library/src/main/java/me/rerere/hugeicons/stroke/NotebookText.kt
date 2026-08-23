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

val HugeIcons.NotebookText: ImageVector
    get() {
        if (_notebookText != null) {
            return _notebookText!!
        }
        _notebookText = ImageVector.Builder(
            name = "NotebookText",
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
            moveTo(9.99219f, 11f)
            horizontalLineTo(13.4922f)
            moveTo(9.99219f, 7f)
            horizontalLineTo(16.9922f)
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
            moveTo(12.9922f, 2f)
            horizontalLineTo(12.4922f)
            curveTo(8.72096f, 2f, 6.83533f, 2f, 5.66376f, 3.17158f)
            curveTo(4.49219f, 4.34315f, 4.49219f, 6.22877f, 4.49219f, 10f)
            verticalLineTo(14f)
            curveTo(4.49219f, 17.7712f, 4.49219f, 19.6569f, 5.66376f, 20.8284f)
            curveTo(6.83533f, 22f, 8.72095f, 22f, 12.4922f, 22f)
            horizontalLineTo(12.9922f)
            curveTo(16.7634f, 22f, 18.649f, 22f, 19.8206f, 20.8284f)
            curveTo(20.9922f, 19.6569f, 20.9922f, 17.7712f, 20.9922f, 14f)
            verticalLineTo(10f)
            curveTo(20.9922f, 6.22877f, 20.9922f, 4.34315f, 19.8206f, 3.17157f)
            curveTo(18.649f, 2f, 16.7634f, 2f, 12.9922f, 2f)
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
            moveTo(5.99219f, 6f)
            horizontalLineTo(2.99219f)
            moveTo(5.99219f, 12f)
            horizontalLineTo(2.99219f)
            moveTo(5.99219f, 18f)
            horizontalLineTo(2.99219f)
        }
        }.build()

        return _notebookText!!
    }

private var _notebookText: ImageVector? = null
