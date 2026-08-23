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

val HugeIcons.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) {
            return _cookingPot!!
        }
        _cookingPot = ImageVector.Builder(
            name = "CookingPot",
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
            moveTo(16.3326f, 9.5f)
            horizontalLineTo(7.6674f)
            curveTo(6.1032f, 9.5f, 5.32109f, 9.5f, 4.78248f, 9.91329f)
            curveTo(4.64381f, 10.0197f, 4.51969f, 10.1438f, 4.41329f, 10.2825f)
            curveTo(4f, 10.8211f, 4f, 11.6029f, 4f, 13.1667f)
            curveTo(4f, 16.2941f, 4f, 17.8578f, 4.82659f, 18.935f)
            curveTo(5.03939f, 19.2124f, 5.28763f, 19.4606f, 5.56495f, 19.6734f)
            curveTo(6.64218f, 20.5f, 8.2059f, 20.5f, 11.3333f, 20.5f)
            horizontalLineTo(12.6667f)
            curveTo(15.7941f, 20.5f, 17.3578f, 20.5f, 18.435f, 19.6734f)
            curveTo(18.7124f, 19.4606f, 18.9606f, 19.2124f, 19.1734f, 18.935f)
            curveTo(20f, 17.8578f, 20f, 16.2941f, 20f, 13.1667f)
            curveTo(20f, 11.6029f, 20f, 10.8211f, 19.5867f, 10.2825f)
            curveTo(19.4803f, 10.1438f, 19.3562f, 10.0197f, 19.2175f, 9.91329f)
            curveTo(18.6789f, 9.5f, 17.8968f, 9.5f, 16.3326f, 9.5f)
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
            moveTo(20f, 11.5f)
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
            moveTo(2f, 11.5f)
            horizontalLineTo(4f)
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
            moveTo(4f, 6.5f)
            lineTo(20f, 6.5f)
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
            moveTo(15f, 6.5f)
            curveTo(15f, 5.56812f, 15f, 5.10218f, 14.8478f, 4.73463f)
            curveTo(14.6448f, 4.24458f, 14.2554f, 3.85523f, 13.7654f, 3.65224f)
            curveTo(13.3978f, 3.5f, 12.9319f, 3.5f, 12f, 3.5f)
            curveTo(11.0681f, 3.5f, 10.6022f, 3.5f, 10.2346f, 3.65224f)
            curveTo(9.74458f, 3.85523f, 9.35523f, 4.24458f, 9.15224f, 4.73463f)
            curveTo(9f, 5.10218f, 9f, 5.56812f, 9f, 6.5f)
        }
        }.build()

        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
