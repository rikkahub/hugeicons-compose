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

val HugeIcons.Rose: ImageVector
    get() {
        if (_rose != null) {
            return _rose!!
        }
        _rose = ImageVector.Builder(
            name = "Rose",
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
            moveTo(14.1242f, 2.61227f)
            curveTo(15.2112f, 1.52379f, 17.0229f, 1.88662f, 18.8346f, 3.70076f)
            curveTo(21.7332f, 6.60338f, 21.0086f, 9.50601f, 20.6462f, 10.5945f)
            lineTo(17.7476f, 13.4971f)
            curveTo(15.7464f, 15.501f, 12.502f, 15.501f, 10.5008f, 13.4971f)
            curveTo(8.49972f, 11.4933f, 8.49972f, 8.2444f, 10.5008f, 6.24055f)
            lineTo(14.1242f, 2.61227f)
            close()
            moveTo(20.6462f, 10.5945f)
            curveTo(18.8346f, 9.02224f, 14.1242f, 6.96621f, 9.77617f, 11.3201f)
            moveTo(14.1242f, 2.61227f)
            curveTo(13.5203f, 3.45887f, 12.9647f, 5.80516f, 15.5735f, 8.41752f)
            curveTo(17.7578f, 7.32389f, 18.2925f, 4.53425f, 18.1453f, 3.20329f)
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
            moveTo(5.06728f, 18.166f)
            curveTo(4.90588f, 17.6386f, 5.24168f, 17.0884f, 5.78541f, 17.0317f)
            curveTo(7.33156f, 16.8703f, 8.29904f, 17.3323f, 8.99999f, 18.0055f)
            curveTo(9.65747f, 18.637f, 10.1273f, 19.64f, 10.4832f, 20.7716f)
            curveTo(10.648f, 21.2957f, 10.3279f, 21.8508f, 9.7895f, 21.933f)
            curveTo(8.72778f, 22.0951f, 7.86563f, 21.9733f, 7.09559f, 21.4257f)
            curveTo(6.31723f, 20.9118f, 5.5941f, 19.8873f, 5.06728f, 18.166f)
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
            moveTo(9f, 12f)
            curveTo(4.5444f, 15f, 3f, 22f, 3f, 22f)
        }
        }.build()

        return _rose!!
    }

private var _rose: ImageVector? = null
