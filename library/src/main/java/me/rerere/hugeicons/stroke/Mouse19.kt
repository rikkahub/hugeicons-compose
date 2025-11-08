package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse19: ImageVector
    get() {
        if (_mouse19 != null) {
            return _mouse19!!
        }
        _mouse19 = ImageVector.Builder(
            name = "Mouse19",
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
        moveTo(12f, 2f)
        verticalLineTo(5f)
        moveTo(12f, 9f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(8.68629f, 2f, 6f, 4.68629f, 6f, 8f)
        curveTo(6f, 8.58014f, 6.08234f, 9.14105f, 6.23596f, 9.67168f)
        curveTo(6.66106f, 11.14f, 6.81572f, 12.9419f, 6.43525f, 14.4224f)
        curveTo(6.31715f, 14.882f, 6.20355f, 15.36f, 6.0501f, 15.8456f)
        curveTo(6.01772f, 15.9481f, 5.9993f, 16.0553f, 6.00216f, 16.1627f)
        curveTo(6.08838f, 19.4012f, 8.7407f, 22f, 12f, 22f)
        curveTo(15.2593f, 22f, 17.9116f, 19.4012f, 17.9978f, 16.1627f)
        curveTo(18.0007f, 16.0553f, 17.9823f, 15.9481f, 17.9499f, 15.8456f)
        curveTo(17.7965f, 15.36f, 17.6828f, 14.882f, 17.5647f, 14.4224f)
        curveTo(17.1843f, 12.9419f, 17.3389f, 11.14f, 17.764f, 9.67168f)
        curveTo(17.9177f, 9.14105f, 18f, 8.58014f, 18f, 8f)
        curveTo(18f, 4.68629f, 15.3137f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 6.5f)
        curveTo(10.5f, 6.03406f, 10.5f, 5.80109f, 10.5761f, 5.61732f)
        curveTo(10.6776f, 5.37229f, 10.8723f, 5.17761f, 11.1173f, 5.07612f)
        curveTo(11.3011f, 5f, 11.5341f, 5f, 12f, 5f)
        curveTo(12.4659f, 5f, 12.6989f, 5f, 12.8827f, 5.07612f)
        curveTo(13.1277f, 5.17761f, 13.3224f, 5.37229f, 13.4239f, 5.61732f)
        curveTo(13.5f, 5.80109f, 13.5f, 6.03406f, 13.5f, 6.5f)
        verticalLineTo(7.5f)
        curveTo(13.5f, 7.96594f, 13.5f, 8.19891f, 13.4239f, 8.38268f)
        curveTo(13.3224f, 8.62771f, 13.1277f, 8.82239f, 12.8827f, 8.92388f)
        curveTo(12.6989f, 9f, 12.4659f, 9f, 12f, 9f)
        curveTo(11.5341f, 9f, 11.3011f, 9f, 11.1173f, 8.92388f)
        curveTo(10.8723f, 8.82239f, 10.6776f, 8.62771f, 10.5761f, 8.38268f)
        curveTo(10.5f, 8.19891f, 10.5f, 7.96594f, 10.5f, 7.5f)
        verticalLineTo(6.5f)
        }
        }.build()

        return _mouse19!!
    }

private var _mouse19: ImageVector? = null
