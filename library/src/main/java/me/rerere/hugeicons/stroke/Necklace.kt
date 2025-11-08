package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Necklace: ImageVector
    get() {
        if (_necklace != null) {
            return _necklace!!
        }
        _necklace = ImageVector.Builder(
            name = "Necklace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.542f, 12.0002f)
        lineTo(10.9325f, 8.87621f)
        curveTo(11.0235f, 8.14822f, 11.3545f, 8.00024f, 12.042f, 8.00024f)
        curveTo(12.7295f, 8.00024f, 13.0605f, 8.14822f, 13.1515f, 8.87621f)
        lineTo(13.542f, 12.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.2844f, 12.6118f)
        curveTo(9.6196f, 11.8003f, 10.785f, 12.1273f, 11.485f, 12.6482f)
        curveTo(11.7721f, 12.8618f, 11.9156f, 12.9685f, 12f, 12.9685f)
        curveTo(12.0845f, 12.9685f, 12.228f, 12.8618f, 12.5151f, 12.6482f)
        curveTo(13.2151f, 12.1273f, 14.3805f, 11.8003f, 15.7157f, 12.6118f)
        curveTo(17.468f, 13.6767f, 17.8645f, 17.1898f, 13.8226f, 20.1538f)
        curveTo(13.0527f, 20.7183f, 12.6678f, 21.0005f, 12f, 21.0005f)
        curveTo(11.3323f, 21.0005f, 10.9474f, 20.7183f, 10.1775f, 20.1538f)
        curveTo(6.13558f, 17.1898f, 6.53208f, 13.6767f, 8.2844f, 12.6118f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.0059f, 3.00024f)
        curveTo(1.90863f, 4.57792f, 2.97686f, 8.0433f, 8.05347f, 9.66205f)
        moveTo(21.9941f, 3.00024f)
        curveTo(22.0914f, 4.57792f, 21.0231f, 8.0433f, 15.9465f, 9.66205f)
        }
        }.build()

        return _necklace!!
    }

private var _necklace: ImageVector? = null
