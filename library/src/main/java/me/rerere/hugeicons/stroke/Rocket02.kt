package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rocket02: ImageVector
    get() {
        if (_rocket02 != null) {
            return _rocket02!!
        }
        _rocket02 = ImageVector.Builder(
            name = "Rocket02",
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
        moveTo(9.66667f, 7.7143f)
        verticalLineTo(6.41327f)
        curveTo(9.66667f, 4.94834f, 10.2781f, 3.68557f, 11.179f, 2.62107f)
        curveTo(11.5294f, 2.20702f, 11.7046f, 2f, 12f, 2f)
        curveTo(12.2954f, 2f, 12.4706f, 2.20702f, 12.821f, 2.62107f)
        curveTo(13.7219f, 3.68557f, 14.3333f, 4.94834f, 14.3333f, 6.41327f)
        verticalLineTo(7.7143f)
        curveTo(14.3333f, 8.78573f, 14.3333f, 9.09036f, 14.9807f, 9.559f)
        curveTo(15.4985f, 9.8919f, 16f, 10.2143f, 16f, 10.8598f)
        curveTo(16f, 11.6429f, 15.6667f, 12f, 14.9358f, 12f)
        horizontalLineTo(9.06415f)
        curveTo(8.33333f, 12f, 8f, 11.6429f, 8f, 10.8598f)
        curveTo(8f, 10.2143f, 8.50146f, 9.8919f, 9.01933f, 9.559f)
        curveTo(9.66667f, 9.09036f, 9.66667f, 8.78573f, 9.66667f, 7.7143f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 22f)
        curveTo(20.8807f, 22f, 22f, 20.8061f, 22f, 19.3333f)
        curveTo(22f, 17.8606f, 20.8807f, 16.6667f, 19.5f, 16.6667f)
        curveTo(19.5f, 15.1939f, 18.3807f, 14f, 17f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 22f)
        curveTo(3.11929f, 22f, 2f, 20.8061f, 2f, 19.3333f)
        curveTo(2f, 17.8606f, 3.11929f, 16.6667f, 4.5f, 16.6667f)
        curveTo(4.5f, 15.1939f, 5.61929f, 14f, 7f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 15f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 15f)
        verticalLineTo(17f)
        }
        }.build()

        return _rocket02!!
    }

private var _rocket02: ImageVector? = null
