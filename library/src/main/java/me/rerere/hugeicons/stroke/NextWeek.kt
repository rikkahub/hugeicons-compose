package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NextWeek: ImageVector
    get() {
        if (_nextWeek != null) {
            return _nextWeek!!
        }
        _nextWeek = ImageVector.Builder(
            name = "NextWeek",
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
        moveTo(15.5f, 7f)
        verticalLineTo(6.5f)
        curveTo(15.5f, 5.09554f, 15.5f, 4.39331f, 15.1629f, 3.88886f)
        curveTo(15.017f, 3.67048f, 14.8295f, 3.48298f, 14.6111f, 3.33706f)
        curveTo(14.1067f, 3f, 13.4045f, 3f, 12f, 3f)
        curveTo(10.5955f, 3f, 9.89331f, 3f, 9.38886f, 3.33706f)
        curveTo(9.17048f, 3.48298f, 8.98298f, 3.67048f, 8.83706f, 3.88886f)
        curveTo(8.5f, 4.39331f, 8.5f, 5.09554f, 8.5f, 6.5f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 7f)
        horizontalLineTo(15f)
        curveTo(17.8089f, 7f, 19.2134f, 7f, 20.2223f, 7.67412f)
        curveTo(20.659f, 7.96596f, 21.034f, 8.34096f, 21.3259f, 8.77772f)
        curveTo(22f, 9.78661f, 22f, 11.1911f, 22f, 14f)
        curveTo(22f, 16.8089f, 22f, 18.2134f, 21.3259f, 19.2223f)
        curveTo(21.034f, 19.659f, 20.659f, 20.034f, 20.2223f, 20.3259f)
        curveTo(19.2134f, 21f, 17.8089f, 21f, 15f, 21f)
        horizontalLineTo(9f)
        curveTo(6.19108f, 21f, 4.78661f, 21f, 3.77772f, 20.3259f)
        curveTo(3.34096f, 20.034f, 2.96596f, 19.659f, 2.67412f, 19.2223f)
        curveTo(2f, 18.2134f, 2f, 16.8089f, 2f, 14f)
        curveTo(2f, 11.1911f, 2f, 9.78661f, 2.67412f, 8.77772f)
        curveTo(2.96596f, 8.34096f, 3.34096f, 7.96596f, 3.77772f, 7.67412f)
        curveTo(4.78661f, 7f, 6.19108f, 7f, 9f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 11f)
        lineTo(11.8f, 11.6f)
        curveTo(13.2667f, 12.7f, 14f, 13.25f, 14f, 14f)
        curveTo(14f, 14.75f, 13.2667f, 15.3f, 11.8f, 16.4f)
        lineTo(11f, 17f)
        }
        }.build()

        return _nextWeek!!
    }

private var _nextWeek: ImageVector? = null
