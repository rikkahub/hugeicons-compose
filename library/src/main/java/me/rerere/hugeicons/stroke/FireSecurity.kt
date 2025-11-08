package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FireSecurity: ImageVector
    get() {
        if (_fireSecurity != null) {
            return _fireSecurity!!
        }
        _fireSecurity = ImageVector.Builder(
            name = "FireSecurity",
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
        moveTo(10.945f, 22f)
        curveTo(6.55709f, 22f, 2.99998f, 18.4183f, 2.99998f, 14f)
        curveTo(2.99998f, 11.9162f, 3.95827f, 9.83244f, 5.20922f, 8f)
        curveTo(5.46594f, 9.5f, 6.57524f, 12.4f, 8.95876f, 12f)
        curveTo(6.33496f, 6.5f, 10.945f, 2f, 10.945f, 2f)
        curveTo(10.945f, 2f, 11.4416f, 5.5f, 15.9107f, 9f)
        curveTo(16.3245f, 9.32407f, 16.6857f, 9.65805f, 17f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5354f, 16.2023f)
        curveTo(15.5354f, 15.5078f, 15.4277f, 14.5459f, 15.8359f, 13.9207f)
        curveTo(16.7377f, 12.5397f, 18.6013f, 12.7799f, 19.2625f, 14.1008f)
        curveTo(19.5631f, 14.7612f, 19.4516f, 15.538f, 19.4669f, 16.1931f)
        moveTo(15.5354f, 16.2023f)
        curveTo(14.6863f, 16.2902f, 14.3202f, 16.8422f, 14.1768f, 17.2829f)
        curveTo(14.0325f, 17.8233f, 13.9123f, 19.1442f, 14.1046f, 20.5852f)
        curveTo(14.2729f, 21.4858f, 14.9066f, 21.9039f, 15.4724f, 21.9541f)
        curveTo(16.0134f, 22.0021f, 18.2978f, 21.9901f, 18.9591f, 21.9901f)
        curveTo(19.9839f, 21.9901f, 20.5851f, 21.7259f, 20.8857f, 20.6452f)
        curveTo(21.0299f, 19.8046f, 21.066f, 18.2436f, 20.8255f, 17.2829f)
        curveTo(20.5597f, 16.4813f, 19.9245f, 16.2483f, 19.4669f, 16.1931f)
        moveTo(15.5354f, 16.2023f)
        curveTo(16.8165f, 16.0696f, 18.1849f, 16.0385f, 19.4669f, 16.1931f)
        }
        }.build()

        return _fireSecurity!!
    }

private var _fireSecurity: ImageVector? = null
