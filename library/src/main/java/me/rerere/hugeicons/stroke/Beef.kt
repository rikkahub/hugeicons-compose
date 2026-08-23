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

val HugeIcons.Beef: ImageVector
    get() {
        if (_beef != null) {
            return _beef!!
        }
        _beef = ImageVector.Builder(
            name = "Beef",
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
            moveTo(10.00006f, 10f)
            arcTo(2f, 2f, 0f, true, false, 6.0000599999999995f, 10f)
            arcTo(2f, 2f, 0f, true, false, 10.00006f, 10f)
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
            moveTo(2f, 10f)
            curveTo(2f, 13.3137f, 4.68629f, 16f, 8f, 16f)
            curveTo(9.05861f, 16f, 10.0532f, 15.7258f, 10.9166f, 15.2447f)
            curveTo(13.1893f, 13.9781f, 14.0001f, 13f, 18f, 12f)
            curveTo(20.2318f, 11.442f, 22f, 10.2091f, 22f, 8f)
            curveTo(22f, 5.79086f, 20.2091f, 4f, 18f, 4f)
            horizontalLineTo(8f)
            curveTo(4.68629f, 4f, 2f, 6.68629f, 2f, 10f)
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
            moveTo(2.00012f, 10f)
            lineTo(2f, 14f)
            curveTo(2f, 17.3137f, 4.68629f, 20f, 8f, 20f)
            curveTo(9.05861f, 20f, 10.0532f, 19.7258f, 10.9166f, 19.2447f)
            curveTo(13.1893f, 17.9781f, 14.0001f, 17f, 18f, 16f)
            curveTo(20.2318f, 15.442f, 22f, 14.2091f, 22f, 12f)
            verticalLineTo(8f)
        }
        }.build()

        return _beef!!
    }

private var _beef: ImageVector? = null
