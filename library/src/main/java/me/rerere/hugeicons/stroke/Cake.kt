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

val HugeIcons.Cake: ImageVector
    get() {
        if (_cake != null) {
            return _cake!!
        }
        _cake = ImageVector.Builder(
            name = "Cake",
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
            moveTo(4f, 15.5f)
            verticalLineTo(20.5f)
            horizontalLineTo(20f)
            verticalLineTo(15.5f)
            curveTo(20f, 12.6716f, 20f, 11.2574f, 19.1213f, 10.3787f)
            curveTo(18.2426f, 9.5f, 16.8284f, 9.5f, 14f, 9.5f)
            horizontalLineTo(10f)
            curveTo(7.17157f, 9.5f, 5.75736f, 9.5f, 4.87868f, 10.3787f)
            curveTo(4f, 11.2574f, 4f, 12.6716f, 4f, 15.5f)
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
            moveTo(19.7324f, 14f)
            curveTo(19.3866f, 14.5978f, 18.7403f, 15f, 18f, 15f)
            curveTo(16.8954f, 15f, 16f, 14.1046f, 16f, 13f)
            curveTo(16f, 14.1046f, 15.1046f, 15f, 14f, 15f)
            curveTo(12.8954f, 15f, 12f, 14.1046f, 12f, 13f)
            curveTo(12f, 14.1046f, 11.1046f, 15f, 10f, 15f)
            curveTo(8.89544f, 15f, 8.00001f, 14.1046f, 8.00001f, 13f)
            curveTo(8.00001f, 14.1046f, 7.10458f, 15f, 6.00001f, 15f)
            curveTo(5.25973f, 15f, 4.61339f, 14.5978f, 4.26758f, 14f)
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
            moveTo(2f, 20.5f)
            horizontalLineTo(22f)
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
            moveTo(14f, 7.5f)
            arcTo(2f, 2f, 0f, true, false, 10f, 7.5f)
            arcTo(2f, 2f, 0f, true, false, 14f, 7.5f)
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
            moveTo(13f, 3.5f)
            curveTo(12.6667f, 3.66667f, 12f, 4.3f, 12f, 5.5f)
        }
        }.build()

        return _cake!!
    }

private var _cake: ImageVector? = null
