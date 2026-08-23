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

val HugeIcons.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = ImageVector.Builder(
            name = "FireExtinguisher",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 18f)
            verticalLineTo(10f)
            curveTo(10f, 7.79086f, 11.7909f, 6f, 14f, 6f)
            curveTo(16.2091f, 6f, 18f, 7.79086f, 18f, 10f)
            verticalLineTo(18f)
            curveTo(18f, 19.8856f, 18f, 20.8284f, 17.4142f, 21.4142f)
            curveTo(16.8284f, 22f, 15.8856f, 22f, 14f, 22f)
            curveTo(12.1144f, 22f, 11.1716f, 22f, 10.5858f, 21.4142f)
            curveTo(10f, 20.8284f, 10f, 19.8856f, 10f, 18f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 13f)
            horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 6f)
            verticalLineTo(4f)
            curveTo(12f, 3.25231f, 12f, 2.87846f, 12.1608f, 2.6f)
            curveTo(12.2661f, 2.41758f, 12.4176f, 2.26609f, 12.6f, 2.16077f)
            curveTo(12.8785f, 2f, 13.2523f, 2f, 14f, 2f)
            curveTo(14.7477f, 2f, 15.1215f, 2f, 15.4f, 2.16077f)
            curveTo(15.5824f, 2.26609f, 15.7339f, 2.41758f, 15.8392f, 2.6f)
            curveTo(16f, 2.87846f, 16f, 3.25231f, 16f, 4f)
            verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 3f)
            horizontalLineTo(11f)
            curveTo(8.23855f, 3f, 5.99997f, 5.23858f, 5.99997f, 8f)
            verticalLineTo(14f)
            curveTo(5.99997f, 15.1046f, 5.10454f, 16f, 3.99997f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 3f)
            horizontalLineTo(20f)
        }
        }.build()

        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
