package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoonSlowWind: ImageVector
    get() {
        if (_moonSlowWind != null) {
            return _moonSlowWind!!
        }
        _moonSlowWind = ImageVector.Builder(
            name = "MoonSlowWind",
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
        moveTo(19.5483f, 18f)
        curveTo(20.7476f, 16.9645f, 21.5819f, 15.6272f, 22f, 14.1756f)
        curveTo(19.5473f, 14.4746f, 17.0369f, 13.3432f, 15.7234f, 11.1113f)
        curveTo(14.4099f, 8.87928f, 14.6664f, 6.1807f, 16.1567f, 4.2463f)
        curveTo(14.1701f, 3.75234f, 11.9929f, 3.98823f, 10.0779f, 5.07295f)
        curveTo(7.30713f, 6.64236f, 5.83056f, 9.56635f, 6.0155f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 15.3739f)
        curveTo(3.13649f, 16.1865f, 4.59053f, 16.1865f, 5.72702f, 15.3739f)
        curveTo(6.41225f, 14.8754f, 7.31476f, 14.8754f, 7.99999f, 15.3739f)
        curveTo(9.13648f, 16.1865f, 10.6072f, 16.2049f, 11.727f, 15.3924f)
        moveTo(17f, 19.6352f)
        curveTo(15.8635f, 18.8226f, 14.4095f, 18.8226f, 13.273f, 19.6352f)
        curveTo(12.5877f, 20.1338f, 11.6685f, 20.1153f, 10.9833f, 19.6167f)
        curveTo(9.8468f, 18.8042f, 8.39277f, 18.8042f, 7.27299f, 19.6167f)
        curveTo(6.57104f, 20.1153f, 5.68524f, 20.1153f, 5f, 19.6167f)
        }
        }.build()

        return _moonSlowWind!!
    }

private var _moonSlowWind: ImageVector? = null
