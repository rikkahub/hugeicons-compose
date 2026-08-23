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

val HugeIcons.BowArrow: ImageVector
    get() {
        if (_bowArrow != null) {
            return _bowArrow!!
        }
        _bowArrow = ImageVector.Builder(
            name = "BowArrow",
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
            moveTo(10f, 14f)
            lineTo(20f, 4f)
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
            moveTo(5.24299f, 15.1543f)
            curveTo(4.7142f, 15.68f, 4.15657f, 16.232f, 3.66853f, 16.7143f)
            curveTo(3.23749f, 17.1402f, 3.02197f, 17.3532f, 3.00283f, 17.5346f)
            curveTo(2.98465f, 17.7068f, 3.05493f, 17.8761f, 3.19001f, 17.9854f)
            curveTo(3.3323f, 18.1007f, 3.63618f, 18.1007f, 4.24396f, 18.1007f)
            curveTo(4.80191f, 18.1007f, 5.08089f, 18.1007f, 5.29552f, 18.2051f)
            curveTo(5.50131f, 18.3052f, 5.66771f, 18.4705f, 5.76847f, 18.675f)
            curveTo(5.87356f, 18.8883f, 5.87358f, 19.1705f, 5.87362f, 19.7349f)
            curveTo(5.87367f, 20.3641f, 5.87369f, 20.6786f, 5.9997f, 20.8231f)
            curveTo(6.10363f, 20.9423f, 6.25695f, 21.0073f, 6.41543f, 20.9994f)
            curveTo(6.60759f, 20.9897f, 6.83179f, 20.7762f, 7.2802f, 20.349f)
            lineTo(8.74318f, 18.9552f)
            curveTo(9.3558f, 18.3716f, 9.66211f, 18.0798f, 9.82722f, 17.7045f)
            curveTo(9.83213f, 17.6933f, 9.83693f, 17.6821f, 9.84164f, 17.6709f)
            curveTo(10f, 17.2927f, 10f, 16.8711f, 10f, 16.0277f)
            verticalLineTo(15.9499f)
            curveTo(10f, 15.0807f, 10f, 14.6461f, 9.75179f, 14.3582f)
            curveTo(9.71731f, 14.3182f, 9.67978f, 14.2809f, 9.63954f, 14.2466f)
            curveTo(9.34982f, 14f, 8.91248f, 14f, 8.03779f, 14f)
            curveTo(7.27234f, 14f, 6.88961f, 14f, 6.54321f, 14.1274f)
            curveTo(6.49316f, 14.1458f, 6.4449f, 14.1656f, 6.39642f, 14.1878f)
            curveTo(6.0609f, 14.3412f, 5.78826f, 14.6123f, 5.24299f, 15.1543f)
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
            moveTo(17f, 3.22126f)
            curveTo(17f, 3.22126f, 20.2808f, 2.72341f, 20.7787f, 3.22129f)
            curveTo(21.2766f, 3.71917f, 20.7787f, 7f, 20.7787f, 7f)
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
            moveTo(18.2396f, 11f)
            curveTo(19.0904f, 13.2868f, 19.0543f, 15.8774f, 18.1635f, 18.1685f)
            curveTo(17.617f, 19.5741f, 17.3438f, 20.2769f, 16.2839f, 20.4999f)
            curveTo(15.224f, 20.7228f, 14.5402f, 20.0391f, 13.1728f, 18.6718f)
            moveTo(5.32864f, 10.8285f)
            curveTo(3.95727f, 9.45733f, 3.27159f, 8.77172f, 3.48591f, 7.71854f)
            curveTo(3.70024f, 6.66535f, 4.4056f, 6.38049f, 5.81632f, 5.81077f)
            curveTo(8.11856f, 4.88101f, 10.7129f, 4.8173f, 13f, 5.68707f)
        }
        }.build()

        return _bowArrow!!
    }

private var _bowArrow: ImageVector? = null
