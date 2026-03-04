package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LayoutAlignRight: ImageVector
    get() {
        if (_layoutAlignRight != null) {
            return _layoutAlignRight!!
        }
        _layoutAlignRight = ImageVector.Builder(
            name = "LayoutAlignRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 3f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 3f, 18.6569f, 3f, 19.8284f, 4.17157f)
        curveTo(21f, 5.34315f, 21f, 7.22876f, 21f, 11f)
        verticalLineTo(13f)
        curveTo(21f, 16.7712f, 21f, 18.6569f, 19.8284f, 19.8284f)
        curveTo(18.6569f, 21f, 16.7712f, 21f, 13f, 21f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 21f, 5.34315f, 21f, 4.17157f, 19.8284f)
        curveTo(3f, 18.6569f, 3f, 16.7712f, 3f, 13f)
        verticalLineTo(11f)
        curveTo(3f, 7.22876f, 3f, 5.34315f, 4.17157f, 4.17157f)
        curveTo(5.34315f, 3f, 7.22876f, 3f, 11f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 8f)
        lineTo(16f, 16f)
        }
        }.build()

        return _layoutAlignRight!!
    }

private var _layoutAlignRight: ImageVector? = null
