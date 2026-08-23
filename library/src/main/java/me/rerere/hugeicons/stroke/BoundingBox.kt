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

val HugeIcons.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) {
            return _boundingBox!!
        }
        _boundingBox = ImageVector.Builder(
            name = "BoundingBox",
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
            moveTo(6f, 4f)
            horizontalLineTo(10f)
            moveTo(4f, 10f)
            verticalLineTo(6f)
            moveTo(12f, 6f)
            verticalLineTo(10f)
            moveTo(6f, 12f)
            horizontalLineTo(10f)
            moveTo(14f, 12f)
            horizontalLineTo(18f)
            moveTo(20f, 14f)
            verticalLineTo(18f)
            moveTo(12f, 14f)
            verticalLineTo(18f)
            moveTo(14f, 20f)
            horizontalLineTo(18f)
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
            moveTo(6f, 4f)
            arcTo(2f, 2f, 0f, true, false, 2f, 4f)
            arcTo(2f, 2f, 0f, true, false, 6f, 4f)
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
            moveTo(6f, 12f)
            arcTo(2f, 2f, 0f, true, false, 2f, 12f)
            arcTo(2f, 2f, 0f, true, false, 6f, 12f)
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
            moveTo(14f, 4f)
            arcTo(2f, 2f, 0f, true, false, 10f, 4f)
            arcTo(2f, 2f, 0f, true, false, 14f, 4f)
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
            moveTo(14f, 12f)
            arcTo(2f, 2f, 0f, true, false, 10f, 12f)
            arcTo(2f, 2f, 0f, true, false, 14f, 12f)
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
            moveTo(22f, 12f)
            arcTo(2f, 2f, 0f, true, false, 18f, 12f)
            arcTo(2f, 2f, 0f, true, false, 22f, 12f)
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
            moveTo(14f, 20f)
            arcTo(2f, 2f, 0f, true, false, 10f, 20f)
            arcTo(2f, 2f, 0f, true, false, 14f, 20f)
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
            moveTo(22f, 20f)
            arcTo(2f, 2f, 0f, true, false, 18f, 20f)
            arcTo(2f, 2f, 0f, true, false, 22f, 20f)
            close()
        }
        }.build()

        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
