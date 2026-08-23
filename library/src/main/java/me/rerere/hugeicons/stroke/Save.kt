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

val HugeIcons.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save = ImageVector.Builder(
            name = "Save",
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
            moveTo(15.8787f, 3f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 3f, 5.34315f, 3f, 4.17157f, 4.17157f)
            curveTo(3f, 5.34315f, 3f, 7.22876f, 3f, 11f)
            verticalLineTo(13f)
            curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
            curveTo(5.34315f, 21f, 7.22876f, 21f, 11f, 21f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 21f, 18.6569f, 21f, 19.8284f, 19.8284f)
            curveTo(21f, 18.6569f, 21f, 16.7712f, 21f, 13f)
            verticalLineTo(8.12132f)
            curveTo(21f, 7.66475f, 21f, 7.43646f, 20.9758f, 7.2174f)
            curveTo(20.8924f, 6.4633f, 20.5963f, 5.74846f, 20.122f, 5.15629f)
            curveTo(19.9843f, 4.98427f, 19.8228f, 4.82285f, 19.5f, 4.5f)
            curveTo(19.1772f, 4.17715f, 19.0157f, 4.01573f, 18.8437f, 3.87795f)
            curveTo(18.2515f, 3.40366f, 17.5367f, 3.10757f, 16.7826f, 3.02421f)
            curveTo(16.5635f, 3f, 16.3353f, 3f, 15.8787f, 3f)
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
            moveTo(17f, 3.5f)
            verticalLineTo(4f)
            curveTo(17f, 5.88562f, 17f, 6.82843f, 16.4142f, 7.41421f)
            curveTo(15.8284f, 8f, 14.8856f, 8f, 13f, 8f)
            horizontalLineTo(11f)
            curveTo(9.11438f, 8f, 8.17157f, 8f, 7.58579f, 7.41421f)
            curveTo(7f, 6.82843f, 7f, 5.88562f, 7f, 4f)
            verticalLineTo(3.5f)
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
            moveTo(17f, 20.5f)
            verticalLineTo(17f)
            curveTo(17f, 15.1144f, 17f, 14.1716f, 16.4142f, 13.5858f)
            curveTo(15.8284f, 13f, 14.8856f, 13f, 13f, 13f)
            horizontalLineTo(11f)
            curveTo(9.11438f, 13f, 8.17157f, 13f, 7.58579f, 13.5858f)
            curveTo(7f, 14.1716f, 7f, 15.1144f, 7f, 17f)
            verticalLineTo(20.5f)
        }
        }.build()

        return _save!!
    }

private var _save: ImageVector? = null
