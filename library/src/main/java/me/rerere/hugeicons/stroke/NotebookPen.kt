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

val HugeIcons.NotebookPen: ImageVector
    get() {
        if (_notebookPen != null) {
            return _notebookPen!!
        }
        _notebookPen = ImageVector.Builder(
            name = "NotebookPen",
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
            moveTo(5.99219f, 6f)
            horizontalLineTo(2.99219f)
            moveTo(5.99219f, 12f)
            horizontalLineTo(2.99219f)
            moveTo(5.99219f, 18f)
            horizontalLineTo(2.99219f)
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
            moveTo(8.99219f, 21.9388f)
            curveTo(7.41097f, 21.8363f, 6.39738f, 21.562f, 5.66376f, 20.8284f)
            curveTo(4.49219f, 19.6569f, 4.49219f, 17.7712f, 4.49219f, 14f)
            verticalLineTo(10f)
            curveTo(4.49219f, 6.22877f, 4.49219f, 4.34315f, 5.66376f, 3.17158f)
            curveTo(6.83533f, 2f, 8.72096f, 2f, 12.4922f, 2f)
            horizontalLineTo(12.9922f)
            curveTo(16.7634f, 2f, 18.649f, 2f, 19.8206f, 3.17157f)
            curveTo(20.9922f, 4.34315f, 20.9922f, 6.22877f, 20.9922f, 10f)
            verticalLineTo(10.5f)
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
            moveTo(19.856f, 14.4393f)
            lineTo(20.5511f, 15.1317f)
            curveTo(21.1392f, 15.7174f, 21.1392f, 16.6672f, 20.5511f, 17.2529f)
            lineTo(16.9093f, 20.9485f)
            curveTo(16.6228f, 21.2338f, 16.2563f, 21.4262f, 15.8581f, 21.5003f)
            lineTo(13.601f, 21.9883f)
            curveTo(13.2446f, 22.0653f, 12.9273f, 21.7502f, 13.0036f, 21.395f)
            lineTo(13.4841f, 19.1598f)
            curveTo(13.5584f, 18.7631f, 13.7516f, 18.3981f, 14.0381f, 18.1128f)
            lineTo(17.7262f, 14.4393f)
            curveTo(18.3143f, 13.8536f, 19.2679f, 13.8536f, 19.856f, 14.4393f)
            close()
        }
        }.build()

        return _notebookPen!!
    }

private var _notebookPen: ImageVector? = null
