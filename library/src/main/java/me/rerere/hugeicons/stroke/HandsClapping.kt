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

val HugeIcons.HandsClapping: ImageVector
    get() {
        if (_handsClapping != null) {
            return _handsClapping!!
        }
        _handsClapping = ImageVector.Builder(
            name = "HandsClapping",
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
            moveTo(14f, 13f)
            verticalLineTo(9.5f)
            curveTo(14f, 8.67157f, 14.6716f, 8f, 15.5f, 8f)
            curveTo(16.3284f, 8f, 17f, 8.67157f, 17f, 9.5f)
            verticalLineTo(16f)
            curveTo(17f, 19.3137f, 14.3137f, 22f, 11f, 22f)
            horizontalLineTo(10.3137f)
            curveTo(8.19198f, 22f, 6.15715f, 21.1571f, 4.65685f, 19.6569f)
            lineTo(2.41421f, 17.4142f)
            curveTo(2.149f, 17.149f, 2f, 16.7893f, 2f, 16.4142f)
            curveTo(2f, 15.6332f, 2.63317f, 15f, 3.41421f, 15f)
            curveTo(3.78929f, 15f, 4.149f, 15.149f, 4.41421f, 15.4142f)
            lineTo(6f, 17f)
            lineTo(2.41421f, 13.4142f)
            curveTo(2.149f, 13.149f, 2f, 12.7893f, 2f, 12.4142f)
            curveTo(2f, 11.6332f, 2.63317f, 11f, 3.41421f, 11f)
            curveTo(3.78929f, 11f, 4.149f, 11.149f, 4.41421f, 11.4142f)
            lineTo(8f, 15f)
            lineTo(3.41421f, 10.4142f)
            curveTo(3.149f, 10.149f, 3f, 9.78929f, 3f, 9.41421f)
            curveTo(3f, 8.63317f, 3.63317f, 8f, 4.41421f, 8f)
            curveTo(4.78929f, 8f, 5.149f, 8.149f, 5.41421f, 8.41421f)
            lineTo(10f, 13f)
            lineTo(6.41421f, 9.41421f)
            curveTo(6.149f, 9.149f, 6f, 8.78929f, 6f, 8.41421f)
            curveTo(6f, 7.63317f, 6.63317f, 7f, 7.41421f, 7f)
            curveTo(7.78929f, 7f, 8.149f, 7.149f, 8.41421f, 7.41421f)
            lineTo(14f, 13f)
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
            moveTo(7f, 2f)
            verticalLineTo(3.5f)
            moveTo(3f, 5f)
            horizontalLineTo(4.5f)
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
            moveTo(16f, 20f)
            curveTo(19.3137f, 20f, 22f, 17.3137f, 22f, 14f)
            verticalLineTo(7.5f)
            curveTo(22f, 6.67157f, 21.3284f, 6f, 20.5f, 6f)
            curveTo(19.8469f, 6f, 19.2913f, 6.4174f, 19.0854f, 7f)
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
            moveTo(14f, 5.5f)
            lineTo(13f, 4.50015f)
            curveTo(12.7348f, 4.23493f, 12.3751f, 4.08594f, 12f, 4.08594f)
            curveTo(11.219f, 4.08594f, 10.5858f, 4.7191f, 10.5858f, 5.50015f)
        }
        }.build()

        return _handsClapping!!
    }

private var _handsClapping: ImageVector? = null
