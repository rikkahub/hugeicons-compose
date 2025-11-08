package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Soundcloud: ImageVector
    get() {
        if (_soundcloud != null) {
            return _soundcloud!!
        }
        _soundcloud = ImageVector.Builder(
            name = "Soundcloud",
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
        moveTo(8f, 6f)
        verticalLineTo(19f)
        moveTo(5.00018f, 9.87917f)
        verticalLineTo(18.9079f)
        moveTo(2f, 11.6296f)
        verticalLineTo(17.1574f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4776f, 10.6001f)
        curveTo(17.485f, 10.6f, 17.4925f, 10.6f, 17.5f, 10.6f)
        curveTo(19.9853f, 10.6f, 22f, 12.4804f, 22f, 14.8f)
        curveTo(22f, 17.1196f, 19.9853f, 19f, 17.5f, 19f)
        horizontalLineTo(14f)
        moveTo(17.4776f, 10.6001f)
        curveTo(17.4924f, 10.4463f, 17.5f, 10.2907f, 17.5f, 10.1333f)
        curveTo(17.5f, 7.29827f, 15.0376f, 5f, 12f, 5f)
        horizontalLineTo(11f)
        verticalLineTo(19f)
        moveTo(17.4776f, 10.6001f)
        curveTo(17.3753f, 11.6589f, 16.9286f, 12.625f, 16.2428f, 13.4f)
        }
        }.build()

        return _soundcloud!!
    }

private var _soundcloud: ImageVector? = null
