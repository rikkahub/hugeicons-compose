package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FastWind: ImageVector
    get() {
        if (_fastWind != null) {
            return _fastWind!!
        }
        _fastWind = ImageVector.Builder(
            name = "FastWind",
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
        moveTo(2f, 5.94145f)
        curveTo(5.5f, 9.37313f, 10.5755f, 7.90241f, 11.7324f, 5.94145f)
        curveTo(11.9026f, 5.65301f, 12f, 5.31814f, 12f, 4.96096f)
        curveTo(12f, 3.87795f, 11.1046f, 3f, 10f, 3f)
        curveTo(8.89543f, 3f, 8f, 3.87795f, 8f, 4.96096f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 8.92814f)
        curveTo(17f, 7.31097f, 18.1193f, 6f, 19.5f, 6f)
        curveTo(20.8807f, 6f, 22f, 7.31097f, 22f, 8.92814f)
        curveTo(22f, 9.6452f, 21.7799f, 10.3021f, 21.4146f, 10.8111f)
        curveTo(19.3463f, 14.1915f, 9.2764f, 12.9164f, 4f, 11.8563f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.0854f, 19.8873f)
        curveTo(13.2913f, 20.5356f, 13.8469f, 21f, 14.5f, 21f)
        curveTo(15.3284f, 21f, 16f, 20.2528f, 16f, 19.331f)
        curveTo(16f, 19.0176f, 15.9224f, 18.7244f, 15.7873f, 18.4738f)
        curveTo(14.4999f, 15.9925f, 7.99996f, 14.3239f, 2f, 18.7746f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 15.5f)
        horizontalLineTo(21f)
        }
        }.build()

        return _fastWind!!
    }

private var _fastWind: ImageVector? = null
