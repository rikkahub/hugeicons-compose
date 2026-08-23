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

val HugeIcons.FishSymbol: ImageVector
    get() {
        if (_fishSymbol != null) {
            return _fishSymbol!!
        }
        _fishSymbol = ImageVector.Builder(
            name = "FishSymbol",
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
            moveTo(3f, 16.0455f)
            curveTo(4.09676f, 16.2648f, 5.63538f, 16.5182f, 7.34198f, 16.658f)
            moveTo(7.34198f, 16.658f)
            curveTo(11.1422f, 16.9694f, 15.7753f, 16.7182f, 18.2175f, 14.276f)
            curveTo(20.6332f, 11.8603f, 21.0701f, 8.78509f, 20.9916f, 6.28838f)
            curveTo(20.9477f, 4.89219f, 20.9257f, 4.1941f, 20.3658f, 3.63419f)
            curveTo(19.8059f, 3.07429f, 19.1078f, 3.05233f, 17.7116f, 3.00841f)
            curveTo(15.2149f, 2.92988f, 12.1397f, 3.36684f, 9.72401f, 5.78251f)
            curveTo(7.28181f, 8.2247f, 7.03055f, 12.8578f, 7.34198f, 16.658f)
            close()
            moveTo(7.34198f, 16.658f)
            curveTo(7.48184f, 18.3646f, 7.73518f, 19.9032f, 7.95453f, 21f)
            moveTo(11.1396f, 5.07472f)
            curveTo(11.1677f, 6.82198f, 12.025f, 8.79129f, 13.6169f, 10.3831f)
            curveTo(15.2087f, 11.975f, 17.178f, 12.8323f, 18.9253f, 12.8604f)
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
            moveTo(15.5f, 6.5f)
            verticalLineTo(6.375f)
            moveTo(15.75f, 6.5f)
            curveTo(15.75f, 6.63807f, 15.6381f, 6.75f, 15.5f, 6.75f)
            curveTo(15.3619f, 6.75f, 15.25f, 6.63807f, 15.25f, 6.5f)
            curveTo(15.25f, 6.36193f, 15.3619f, 6.25f, 15.5f, 6.25f)
            curveTo(15.6381f, 6.25f, 15.75f, 6.36193f, 15.75f, 6.5f)
            close()
        }
        }.build()

        return _fishSymbol!!
    }

private var _fishSymbol: ImageVector? = null
