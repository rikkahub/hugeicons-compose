package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GpsDisconnected: ImageVector
    get() {
        if (_gpsDisconnected != null) {
            return _gpsDisconnected!!
        }
        _gpsDisconnected = ImageVector.Builder(
            name = "GpsDisconnected",
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
        moveTo(21.9999f, 7.99997f)
        lineTo(18.9999f, 4.99997f)
        moveTo(18.9999f, 4.99997f)
        lineTo(15.9999f, 1.99997f)
        moveTo(18.9999f, 4.99997f)
        lineTo(15.9999f, 7.99997f)
        moveTo(18.9999f, 4.99997f)
        lineTo(21.9999f, 1.99997f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.99988f, 10.0294f)
        curveTo(10.3725f, 8.65685f, 12.5979f, 8.65685f, 13.9704f, 10.0294f)
        curveTo(15.343f, 11.402f, 15.343f, 13.6274f, 13.9704f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.85277f, 19.1471f)
        curveTo(8.04856f, 22.3429f, 12.9126f, 22.8538f, 16.6417f, 20.6797f)
        curveTo(17.5284f, 20.1627f, 17.9717f, 19.9043f, 17.9988f, 19.3782f)
        curveTo(18.0259f, 18.8522f, 17.5276f, 18.4882f, 16.5308f, 17.7603f)
        curveTo(14.6828f, 16.4107f, 12.8635f, 14.7603f, 11.0515f, 12.9484f)
        curveTo(9.23955f, 11.1364f, 7.58915f, 9.31705f, 6.23957f, 7.46904f)
        curveTo(5.51167f, 6.47231f, 5.14772f, 5.97395f, 4.62166f, 6.00105f)
        curveTo(4.0956f, 6.02815f, 3.83713f, 6.47149f, 3.32019f, 7.35818f)
        curveTo(1.14611f, 11.0873f, 1.65697f, 15.9513f, 4.85277f, 19.1471f)
        }
        }.build()

        return _gpsDisconnected!!
    }

private var _gpsDisconnected: ImageVector? = null
