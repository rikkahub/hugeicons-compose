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

val HugeIcons.Candy: ImageVector
    get() {
        if (_candy != null) {
            return _candy!!
        }
        _candy = ImageVector.Builder(
            name = "Candy",
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
            moveTo(7.44975f, 9.55025f)
            lineTo(9.55025f, 7.44975f)
            curveTo(10.4785f, 6.52149f, 11.7375f, 6f, 13.0503f, 6f)
            curveTo(15.7839f, 6f, 18f, 8.21608f, 18f, 10.9497f)
            curveTo(18f, 12.2625f, 17.4785f, 13.5215f, 16.5503f, 14.4497f)
            lineTo(14.4497f, 16.5503f)
            curveTo(13.5215f, 17.4785f, 12.2625f, 18f, 10.9497f, 18f)
            curveTo(8.21608f, 18f, 6f, 15.7839f, 6f, 13.0503f)
            curveTo(6f, 11.7375f, 6.52149f, 10.4785f, 7.44975f, 9.55025f)
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
            moveTo(14f, 6.5f)
            verticalLineTo(16.5f)
            moveTo(10f, 7.5f)
            verticalLineTo(17.5f)
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
            moveTo(17.5f, 8.5f)
            lineTo(21.5115f, 8.05428f)
            curveTo(21.7896f, 8.02338f, 22f, 7.78832f, 22f, 7.50851f)
            curveTo(22f, 7.22157f, 21.7748f, 7.00246f, 21.497f, 6.93046f)
            curveTo(21.2738f, 6.8726f, 21.0465f, 6.76078f, 20.8095f, 6.52381f)
            curveTo(19.9429f, 5.65714f, 20.7238f, 5.00952f, 19.8571f, 4.14286f)
            curveTo(19.0238f, 3.30952f, 18.3095f, 4.02381f, 17.4762f, 3.19048f)
            curveTo(17.2351f, 2.94935f, 17.1215f, 2.72518f, 17.0645f, 2.50853f)
            curveTo(16.9911f, 2.2298f, 16.7746f, 2f, 16.4864f, 2f)
            curveTo(16.2095f, 2f, 15.9769f, 2.20822f, 15.9463f, 2.48345f)
            lineTo(15.5f, 6.5f)
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
            moveTo(6.5f, 15.5f)
            lineTo(2.48849f, 15.9457f)
            curveTo(2.21039f, 15.9766f, 2f, 16.2117f, 2f, 16.4915f)
            curveTo(2f, 16.7784f, 2.22522f, 16.9975f, 2.50298f, 17.0695f)
            curveTo(2.72617f, 17.1274f, 2.95351f, 17.2392f, 3.19048f, 17.4762f)
            curveTo(4.05714f, 18.3429f, 3.27619f, 18.9905f, 4.14286f, 19.8571f)
            curveTo(4.97619f, 20.6905f, 5.69048f, 19.9762f, 6.52381f, 20.8095f)
            curveTo(6.76494f, 21.0507f, 6.87852f, 21.2748f, 6.93554f, 21.4915f)
            curveTo(7.0089f, 21.7702f, 7.22536f, 22f, 7.51357f, 22f)
            curveTo(7.7905f, 22f, 8.02314f, 21.7918f, 8.05372f, 21.5165f)
            lineTo(8.5f, 17.5f)
        }
        }.build()

        return _candy!!
    }

private var _candy: ImageVector? = null
