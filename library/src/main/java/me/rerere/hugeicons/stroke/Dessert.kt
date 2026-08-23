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

val HugeIcons.Dessert: ImageVector
    get() {
        if (_dessert != null) {
            return _dessert!!
        }
        _dessert = ImageVector.Builder(
            name = "Dessert",
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
            moveTo(14f, 6f)
            arcTo(2f, 2f, 0f, true, false, 10f, 6f)
            arcTo(2f, 2f, 0f, true, false, 14f, 6f)
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
            moveTo(12f, 18f)
            curveTo(7.02944f, 18f, 3f, 16.2091f, 3f, 14f)
            curveTo(3f, 13.2714f, 3.43827f, 12.5883f, 4.20404f, 12f)
            moveTo(17.9531f, 17f)
            curveTo(17.0977f, 17.3355f, 16.0977f, 17.6f, 15f, 17.7724f)
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
            moveTo(20.9304f, 17.5f)
            curveTo(20.9763f, 17.6638f, 21f, 17.8307f, 21f, 18f)
            curveTo(21f, 20.2091f, 16.9706f, 22f, 12f, 22f)
            curveTo(7.02944f, 22f, 3f, 20.2091f, 3f, 18f)
            curveTo(3f, 17.2714f, 3.43827f, 16.5883f, 4.20404f, 16f)
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
            moveTo(14f, 6.09863f)
            curveTo(18.008f, 6.50284f, 21f, 9f, 21f, 12f)
            verticalLineTo(16.4995f)
            curveTo(21f, 17.3279f, 20.3284f, 17.9995f, 19.5f, 17.9995f)
            curveTo(18.6716f, 17.9995f, 18f, 17.3279f, 18f, 16.4995f)
            verticalLineTo(14.9995f)
            curveTo(18f, 14.1711f, 17.3284f, 13.4995f, 16.5f, 13.4995f)
            curveTo(15.6716f, 13.4995f, 15f, 14.1711f, 15f, 14.9995f)
            verticalLineTo(17.4995f)
            curveTo(15f, 18.3279f, 14.3284f, 18.9995f, 13.5f, 18.9995f)
            curveTo(12.6716f, 18.9995f, 12f, 18.3279f, 12f, 17.4995f)
            verticalLineTo(16.4995f)
            curveTo(12f, 15.9948f, 12f, 15.7425f, 11.9675f, 15.5645f)
            curveTo(11.8224f, 14.7687f, 11.3766f, 14.2624f, 10.6057f, 14.0174f)
            curveTo(10.4333f, 13.9626f, 10.124f, 13.923f, 9.50557f, 13.8439f)
            curveTo(5.74843f, 13.3632f, 3f, 11.824f, 3f, 9.99951f)
            curveTo(3f, 8.09588f, 5.99202f, 6.50284f, 10f, 6.09863f)
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
            moveTo(13f, 2f)
            curveTo(12.6667f, 2.16667f, 12f, 2.8f, 12f, 4f)
        }
        }.build()

        return _dessert!!
    }

private var _dessert: ImageVector? = null
