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

val HugeIcons.Mushroom01: ImageVector
    get() {
        if (_mushroom01 != null) {
            return _mushroom01!!
        }
        _mushroom01 = ImageVector.Builder(
            name = "Mushroom01",
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
            moveTo(17f, 15f)
            curveTo(19.412f, 14.6082f, 21f, 13.9411f, 21f, 13.1839f)
            curveTo(21f, 11.9778f, 16.9706f, 11f, 12f, 11f)
            curveTo(7.02944f, 11f, 3f, 11.9778f, 3f, 13.1839f)
            curveTo(3f, 13.9411f, 4.58803f, 14.6082f, 7f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 13f)
            curveTo(21f, 6.92487f, 16.9706f, 2f, 12f, 2f)
            curveTo(7.02944f, 2f, 3f, 6.92487f, 3f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 4.76514f)
            curveTo(17.5348f, 5.50377f, 16.671f, 6f, 15.6823f, 6f)
            curveTo(14.2009f, 6f, 13f, 4.88603f, 13f, 3.51187f)
            curveTo(13f, 2.94318f, 13.2057f, 2.41905f, 13.5518f, 2f)
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
            moveTo(10f, 11.5f)
            curveTo(9.99527f, 14.9495f, 9.90043f, 20.1752f, 8f, 22f)
            moveTo(14f, 11.5f)
            curveTo(14.0047f, 14.9495f, 14.0996f, 20.1752f, 16f, 22f)
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
            moveTo(9.125f, 7f)
            horizontalLineTo(9f)
            moveTo(9.25f, 7f)
            curveTo(9.25f, 7.13807f, 9.13807f, 7.25f, 9f, 7.25f)
            curveTo(8.86193f, 7.25f, 8.75f, 7.13807f, 8.75f, 7f)
            curveTo(8.75f, 6.86193f, 8.86193f, 6.75f, 9f, 6.75f)
            curveTo(9.13807f, 6.75f, 9.25f, 6.86193f, 9.25f, 7f)
            close()
        }
        }.build()

        return _mushroom01!!
    }

private var _mushroom01: ImageVector? = null
