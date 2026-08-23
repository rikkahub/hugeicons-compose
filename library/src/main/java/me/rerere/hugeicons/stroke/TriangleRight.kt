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

val HugeIcons.TriangleRight: ImageVector
    get() {
        if (_triangleRight != null) {
            return _triangleRight!!
        }
        _triangleRight = ImageVector.Builder(
            name = "TriangleRight",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.9923f, 20f)
            horizontalLineTo(9.97692f)
            curveTo(5.00637f, 20f, 2.52109f, 20f, 2.06437f, 18.6269f)
            curveTo(1.60764f, 17.2538f, 3.59586f, 15.7594f, 7.5723f, 12.7707f)
            lineTo(15.5877f, 6.74622f)
            curveTo(18.3856f, 4.64326f, 19.7846f, 3.59178f, 20.8923f, 4.14682f)
            curveTo(22f, 4.70186f, 22f, 6.45432f, 22f, 9.95926f)
            verticalLineTo(15.9837f)
            curveTo(22f, 17.877f, 22f, 18.8237f, 21.4131f, 19.4118f)
            curveTo(20.8262f, 20f, 19.8816f, 20f, 17.9923f, 20f)
            close()
        }
        }.build()

        return _triangleRight!!
    }

private var _triangleRight: ImageVector? = null
