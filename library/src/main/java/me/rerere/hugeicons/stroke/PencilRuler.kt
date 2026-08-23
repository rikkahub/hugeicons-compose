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

val HugeIcons.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) {
            return _pencilRuler!!
        }
        _pencilRuler = ImageVector.Builder(
            name = "PencilRuler",
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
            moveTo(16.044f, 11f)
            lineTo(19.3137f, 14.2698f)
            curveTo(20.3397f, 15.2958f, 20.8527f, 15.8088f, 20.9665f, 16.4258f)
            curveTo(21.0112f, 16.6677f, 21.0112f, 16.9158f, 20.9665f, 17.1577f)
            curveTo(20.8527f, 17.7747f, 20.3397f, 18.2877f, 19.3137f, 19.3137f)
            curveTo(18.2877f, 20.3397f, 17.7747f, 20.8527f, 17.1577f, 20.9665f)
            curveTo(16.9158f, 21.0112f, 16.6677f, 21.0112f, 16.4258f, 20.9665f)
            curveTo(15.8088f, 20.8527f, 15.2958f, 20.3397f, 14.2698f, 19.3137f)
            lineTo(11f, 16.044f)
            moveTo(7.84313f, 12.8871f)
            lineTo(4.68627f, 9.73022f)
            curveTo(3.66027f, 8.70423f, 3.14727f, 8.19123f, 3.03347f, 7.5742f)
            curveTo(2.98884f, 7.33227f, 2.98884f, 7.08422f, 3.03347f, 6.84228f)
            curveTo(3.14727f, 6.22526f, 3.66027f, 5.71226f, 4.68627f, 4.68627f)
            curveTo(5.71226f, 3.66027f, 6.22526f, 3.14727f, 6.84228f, 3.03347f)
            curveTo(7.08422f, 2.98884f, 7.33227f, 2.98884f, 7.5742f, 3.03347f)
            curveTo(8.19123f, 3.14727f, 8.70423f, 3.66027f, 9.73022f, 4.68627f)
            lineTo(13f, 7.95605f)
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
            moveTo(15.5f, 5.5f)
            lineTo(17.4697f, 3.53033f)
            curveTo(17.8092f, 3.19076f, 18.2698f, 3f, 18.75f, 3f)
            curveTo(19.2302f, 3f, 19.6908f, 3.19077f, 20.0303f, 3.53033f)
            lineTo(20.4697f, 3.96967f)
            curveTo(20.8092f, 4.30923f, 21f, 4.76978f, 21f, 5.25f)
            curveTo(21f, 5.73022f, 20.8092f, 6.19077f, 20.4697f, 6.53033f)
            lineTo(18.5f, 8.5f)
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
            moveTo(7.36645f, 19.6331f)
            lineTo(18.5f, 8.5f)
            lineTo(15.5f, 5.5f)
            lineTo(4.36648f, 16.6331f)
            curveTo(4.12613f, 16.8735f, 3.951f, 17.1711f, 3.85762f, 17.4979f)
            lineTo(3.01687f, 20.4405f)
            curveTo(3.00568f, 20.4797f, 3f, 20.5203f, 3f, 20.561f)
            curveTo(3f, 20.8032f, 3.19636f, 20.9996f, 3.43858f, 20.9996f)
            curveTo(3.47933f, 20.9996f, 3.51988f, 20.9939f, 3.55906f, 20.9827f)
            lineTo(6.50171f, 20.1419f)
            curveTo(6.82851f, 20.0486f, 7.12612f, 19.8735f, 7.36645f, 19.6331f)
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
            moveTo(10f, 5f)
            lineTo(8.5f, 6.5f)
            moveTo(19f, 14f)
            lineTo(17.5f, 15.5f)
        }
        }.build()

        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
