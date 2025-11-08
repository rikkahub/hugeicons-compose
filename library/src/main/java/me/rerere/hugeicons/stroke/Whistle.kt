package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Whistle: ImageVector
    get() {
        if (_whistle != null) {
            return _whistle!!
        }
        _whistle = ImageVector.Builder(
            name = "Whistle",
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
        moveTo(3.10372f, 11.5252f)
        curveTo(4.5522f, 9.4378f, 7.06815f, 8.86485f, 8.53763f, 9.00054f)
        horizontalLineTo(11.0609f)
        curveTo(11.5887f, 9.09126f, 11.734f, 9.30978f, 12.3879f, 10.3428f)
        curveTo(12.5068f, 10.6673f, 14.4421f, 10.4487f, 14.9506f, 10.5017f)
        curveTo(15.5091f, 9.96055f, 14.9506f, 8.85082f, 16.1911f, 9.00826f)
        curveTo(18.3195f, 9.00826f, 20.359f, 8.91699f, 21.2926f, 9.0542f)
        curveTo(21.678f, 9.11085f, 21.8634f, 9.45879f, 21.9189f, 9.84439f)
        curveTo(22.1422f, 11.3942f, 21.8764f, 12.5285f, 21.6192f, 12.7882f)
        curveTo(20.9324f, 14.004f, 18.9502f, 15.1828f, 17.9677f, 14.9959f)
        curveTo(15.133f, 14.9959f, 14.52f, 14.9221f, 14.2742f, 15.3924f)
        lineTo(13.4101f, 17.6267f)
        curveTo(12.833f, 18.8562f, 10.8098f, 21.283f, 7.41618f, 20.9705f)
        curveTo(4.02257f, 20.6581f, 2.54699f, 17.9449f, 2.24399f, 16.6574f)
        curveTo(1.94099f, 15.8329f, 1.65427f, 13.6141f, 3.10372f, 11.5252f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.4893f, 5.00318f)
        verticalLineTo(3.00195f)
        moveTo(10.9942f, 6.00379f)
        lineTo(9.99609f, 5.00318f)
        moveTo(15.9845f, 6.00379f)
        lineTo(16.9826f, 5.00318f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.08398f, 17f)
        curveTo(9.18855f, 17f, 10.084f, 16.1046f, 10.084f, 15f)
        curveTo(10.084f, 13.8954f, 9.18855f, 13f, 8.08398f, 13f)
        curveTo(6.97941f, 13f, 6.08398f, 13.8954f, 6.08398f, 15f)
        curveTo(6.08398f, 16.1046f, 6.97941f, 17f, 8.08398f, 17f)
        }
        }.build()

        return _whistle!!
    }

private var _whistle: ImageVector? = null
