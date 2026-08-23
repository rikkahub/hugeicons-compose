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

val HugeIcons.ArrowDown10: ImageVector
    get() {
        if (_arrowDown10 != null) {
            return _arrowDown10!!
        }
        _arrowDown10 = ImageVector.Builder(
            name = "ArrowDown10",
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
            moveTo(8f, 19f)
            verticalLineTo(4f)
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
            moveTo(16f, 10f)
            horizontalLineTo(20f)
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
            moveTo(20f, 18f)
            verticalLineTo(16f)
            curveTo(20f, 14.8954f, 19.1046f, 14f, 18f, 14f)
            curveTo(16.8954f, 14f, 16f, 14.8954f, 16f, 16f)
            verticalLineTo(18f)
            curveTo(16f, 19.1046f, 16.8954f, 20f, 18f, 20f)
            curveTo(19.1046f, 20f, 20f, 19.1046f, 20f, 18f)
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
            moveTo(18f, 10f)
            verticalLineTo(5.48779f)
            curveTo(18f, 4.61275f, 18f, 4.17523f, 17.7236f, 4.03665f)
            curveTo(17.4472f, 3.89808f, 17.0981f, 4.1606f, 16.4f, 4.68562f)
            lineTo(16f, 4.98644f)
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
            moveTo(4f, 16f)
            curveTo(4f, 16f, 6.94596f, 20f, 8.00003f, 20f)
            curveTo(9.05411f, 20f, 12f, 16f, 12f, 16f)
        }
        }.build()

        return _arrowDown10!!
    }

private var _arrowDown10: ImageVector? = null
