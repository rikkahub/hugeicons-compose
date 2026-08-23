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

val HugeIcons.NotepadText: ImageVector
    get() {
        if (_notepadText != null) {
            return _notepadText!!
        }
        _notepadText = ImageVector.Builder(
            name = "NotepadText",
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
            moveTo(16.4922f, 2f)
            verticalLineTo(5f)
            moveTo(7.49219f, 2f)
            verticalLineTo(5f)
            moveTo(11.9922f, 2f)
            verticalLineTo(5f)
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
            moveTo(12.9922f, 3.5f)
            horizontalLineTo(10.9922f)
            curveTo(7.69236f, 3.5f, 6.04244f, 3.5f, 5.01731f, 4.52513f)
            curveTo(3.99219f, 5.55025f, 3.99219f, 7.20017f, 3.99219f, 10.5f)
            verticalLineTo(15f)
            curveTo(3.99219f, 18.2998f, 3.99219f, 19.9497f, 5.01731f, 20.9749f)
            curveTo(6.04244f, 22f, 7.69236f, 22f, 10.9922f, 22f)
            horizontalLineTo(12.9922f)
            curveTo(16.292f, 22f, 17.9419f, 22f, 18.9671f, 20.9749f)
            curveTo(19.9922f, 19.9497f, 19.9922f, 18.2998f, 19.9922f, 15f)
            verticalLineTo(10.5f)
            curveTo(19.9922f, 7.20017f, 19.9922f, 5.55025f, 18.9671f, 4.52512f)
            curveTo(17.9419f, 3.5f, 16.292f, 3.5f, 12.9922f, 3.5f)
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
            moveTo(7.99219f, 15f)
            horizontalLineTo(11.9922f)
            moveTo(7.99219f, 11f)
            horizontalLineTo(15.9922f)
        }
        }.build()

        return _notepadText!!
    }

private var _notepadText: ImageVector? = null
