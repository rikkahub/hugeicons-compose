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

val HugeIcons.TreeDeciduous: ImageVector
    get() {
        if (_treeDeciduous != null) {
            return _treeDeciduous!!
        }
        _treeDeciduous = ImageVector.Builder(
            name = "TreeDeciduous",
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
            verticalLineTo(9f)
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
            moveTo(9f, 18.002f)
            curveTo(7.34315f, 18.002f, 6f, 16.6234f, 6f, 14.9665f)
            curveTo(4.30385f, 14.7239f, 3f, 13.2652f, 3f, 11.502f)
            curveTo(3f, 10.0052f, 3.93951f, 8.7279f, 5.26097f, 8.22759f)
            curveTo(5.09327f, 7.85339f, 5f, 7.43856f, 5f, 7.00195f)
            curveTo(5f, 5.3451f, 6.34315f, 4.00195f, 8f, 4.00195f)
            curveTo(8.39025f, 4.00195f, 8.76309f, 4.07647f, 9.10508f, 4.21204f)
            curveTo(9.45179f, 2.93842f, 10.6165f, 2.00195f, 12f, 2.00195f)
            curveTo(13.3835f, 2.00195f, 14.5482f, 2.93842f, 14.8949f, 4.21204f)
            curveTo(15.2369f, 4.07647f, 15.6098f, 4.00195f, 16f, 4.00195f)
            curveTo(17.6569f, 4.00195f, 19f, 5.3451f, 19f, 7.00195f)
            curveTo(19f, 7.43856f, 18.9067f, 7.85339f, 18.739f, 8.22759f)
            curveTo(20.0605f, 8.7279f, 21f, 10.0052f, 21f, 11.502f)
            curveTo(21f, 13.2653f, 19.696f, 14.724f, 17.9998f, 14.9665f)
            curveTo(17.9998f, 16.6234f, 16.6569f, 18.002f, 15f, 18.002f)
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
            moveTo(12f, 15f)
            lineTo(14.5f, 12.5f)
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
            moveTo(12f, 13f)
            lineTo(9.5f, 10.5f)
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
            moveTo(10f, 22f)
            horizontalLineTo(14f)
        }
        }.build()

        return _treeDeciduous!!
    }

private var _treeDeciduous: ImageVector? = null
