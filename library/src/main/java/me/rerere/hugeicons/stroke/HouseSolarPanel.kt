package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HouseSolarPanel: ImageVector
    get() {
        if (_houseSolarPanel != null) {
            return _houseSolarPanel!!
        }
        _houseSolarPanel = ImageVector.Builder(
            name = "HouseSolarPanel",
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
        moveTo(3.96586f, 5.79755f)
        lineTo(4.56916f, 4.39672f)
        curveTo(5.06999f, 3.23383f, 5.32041f, 2.65238f, 5.81138f, 2.32619f)
        curveTo(6.30235f, 2f, 6.92711f, 2f, 8.17664f, 2f)
        horizontalLineTo(15.8234f)
        curveTo(17.0729f, 2f, 17.6976f, 2f, 18.1886f, 2.32619f)
        curveTo(18.6796f, 2.65238f, 18.93f, 3.23383f, 19.4308f, 4.39672f)
        lineTo(20.0341f, 5.79755f)
        curveTo(20.8508f, 7.69388f, 21.2592f, 8.64205f, 20.8221f, 9.32102f)
        curveTo(20.3849f, 10f, 19.3661f, 10f, 17.3285f, 10f)
        horizontalLineTo(6.67147f)
        curveTo(4.63387f, 10f, 3.61507f, 10f, 3.17794f, 9.32102f)
        curveTo(2.7408f, 8.64205f, 3.14915f, 7.69388f, 3.96586f, 5.79755f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 10f)
        verticalLineTo(15f)
        curveTo(4.5f, 16.8856f, 4.5f, 17.8284f, 5.08579f, 18.4142f)
        curveTo(5.55733f, 18.8858f, 6.26022f, 18.9777f, 7.5f, 18.9957f)
        moveTo(19.5f, 10f)
        verticalLineTo(15f)
        curveTo(19.5f, 16.8856f, 19.5f, 17.8284f, 18.9142f, 18.4142f)
        curveTo(18.4427f, 18.8858f, 17.7398f, 18.9777f, 16.5f, 18.9957f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 14f)
        lineTo(10.4058f, 17.0672f)
        curveTo(10.0891f, 17.4778f, 9.93078f, 17.6831f, 10.0289f, 17.8416f)
        curveTo(10.127f, 18f, 10.4124f, 18f, 10.9833f, 18f)
        horizontalLineTo(13.0167f)
        curveTo(13.5876f, 18f, 13.873f, 18f, 13.9711f, 18.1584f)
        curveTo(14.0692f, 18.3169f, 13.9109f, 18.5222f, 13.5942f, 18.9328f)
        lineTo(10.9833f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 2f)
        lineTo(9f, 10f)
        moveTo(14f, 2f)
        lineTo(15f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 6f)
        horizontalLineTo(20f)
        }
        }.build()

        return _houseSolarPanel!!
    }

private var _houseSolarPanel: ImageVector? = null
