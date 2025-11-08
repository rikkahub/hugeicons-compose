package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = ImageVector.Builder(
            name = "Rocket",
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
        moveTo(8f, 10.1667f)
        lineTo(12.1232f, 6.04344f)
        curveTo(13.2481f, 4.91858f, 13.8105f, 4.35614f, 14.4312f, 3.90314f)
        curveTo(15.7047f, 2.9737f, 17.1818f, 2.36187f, 18.7395f, 2.11858f)
        curveTo(19.4988f, 2f, 20.2942f, 2f, 21.885f, 2f)
        curveTo(21.9681f, 2f, 22f, 2.03812f, 22f, 2.11504f)
        curveTo(22f, 3.70584f, 22f, 4.50125f, 21.8814f, 5.26046f)
        curveTo(21.6381f, 6.81818f, 21.0263f, 8.29527f, 20.0969f, 9.56878f)
        curveTo(19.6439f, 10.1895f, 19.0814f, 10.7519f, 17.9566f, 11.8768f)
        lineTo(13.8333f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.341f, 8.09838f)
        curveTo(8.63808f, 8.09838f, 6.49778f, 7.73765f, 4.9043f, 8.39769f)
        curveTo(3.73671f, 8.88132f, 2.87754f, 10.0012f, 2f, 10.8787f)
        lineTo(5.30597f, 12.2955f)
        curveTo(6.18208f, 12.671f, 5.64651f, 13.7766f, 5.50147f, 14.5018f)
        curveTo(5.33985f, 15.3099f, 5.34886f, 15.3397f, 5.93158f, 15.9224f)
        lineTo(8.07758f, 18.0684f)
        curveTo(8.6603f, 18.6511f, 8.69008f, 18.6602f, 9.49816f, 18.4985f)
        curveTo(10.2234f, 18.3535f, 11.329f, 17.8179f, 11.7044f, 18.694f)
        lineTo(13.1213f, 22f)
        curveTo(13.9988f, 21.1225f, 15.1187f, 20.2633f, 15.6023f, 19.0957f)
        curveTo(16.2624f, 17.5022f, 15.9016f, 15.3619f, 15.9016f, 13.659f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20f)
        lineTo(11f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 12f)
        lineTo(3f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 4.07996f)
        curveTo(16.2f, 4.25996f, 17.46f, 4.73996f, 18.1614f, 5.45996f)
        curveTo(19.0576f, 6.25211f, 19.68f, 7.31996f, 19.92f, 8.99996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.94f, 6.06006f)
        lineTo(16.5f, 7.50006f)
        }
        }.build()

        return _rocket!!
    }

private var _rocket: ImageVector? = null
