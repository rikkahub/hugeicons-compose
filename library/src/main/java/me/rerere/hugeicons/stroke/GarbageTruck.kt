package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GarbageTruck: ImageVector
    get() {
        if (_garbageTruck != null) {
            return _garbageTruck!!
        }
        _garbageTruck = ImageVector.Builder(
            name = "GarbageTruck",
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
        moveTo(11f, 9f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 10f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 4f)
        horizontalLineTo(15f)
        moveTo(15f, 4f)
        horizontalLineTo(9.48528f)
        curveTo(8.25903f, 4f, 7.6459f, 4f, 7.09459f, 4.22836f)
        curveTo(6.54328f, 4.45672f, 6.10973f, 4.89027f, 5.24264f, 5.75736f)
        lineTo(3.46446f, 7.53554f)
        curveTo(2.74189f, 8.25811f, 2.3806f, 8.6194f, 2.1903f, 9.07883f)
        curveTo(2f, 9.53825f, 2f, 10.0492f, 2f, 11.0711f)
        verticalLineTo(13f)
        curveTo(2f, 15.357f, 2f, 16.5355f, 2.73223f, 17.2678f)
        curveTo(3.2191f, 17.7546f, 3.90328f, 17.9178f, 5f, 17.9724f)
        moveTo(15f, 4f)
        verticalLineTo(8f)
        curveTo(15f, 9.88562f, 15f, 10.8284f, 15.5858f, 11.4142f)
        curveTo(16.1716f, 12f, 17.1144f, 12f, 19f, 12f)
        horizontalLineTo(22f)
        verticalLineTo(13f)
        curveTo(22f, 15.357f, 22f, 16.5355f, 21.2678f, 17.2678f)
        curveTo(20.7809f, 17.7546f, 20.0967f, 17.9178f, 19f, 17.9724f)
        moveTo(9f, 18f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7f)
        horizontalLineTo(16.6998f)
        curveTo(18.0581f, 7f, 18.7373f, 7f, 19.29f, 7.35371f)
        curveTo(19.8427f, 7.70742f, 20.1647f, 8.34811f, 20.8087f, 9.6295f)
        lineTo(22f, 12f)
        }
        }.build()

        return _garbageTruck!!
    }

private var _garbageTruck: ImageVector? = null
