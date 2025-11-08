package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Departement: ImageVector
    get() {
        if (_departement != null) {
            return _departement!!
        }
        _departement = ImageVector.Builder(
            name = "Departement",
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
        moveTo(21f, 13.8829f)
        lineTo(20.9999f, 9.12817f)
        curveTo(20.9993f, 7.99289f, 20.999f, 7.42525f, 20.723f, 6.94931f)
        curveTo(20.447f, 6.47337f, 19.9544f, 6.19544f, 18.9692f, 5.63957f)
        lineTo(13.944f, 2.80421f)
        curveTo(12.9938f, 2.26807f, 12.5187f, 2f, 12f, 2f)
        curveTo(11.4813f, 2f, 11.0062f, 2.26807f, 10.056f, 2.80421f)
        lineTo(5.0308f, 5.63957f)
        curveTo(4.04562f, 6.19544f, 3.55303f, 6.47337f, 3.277f, 6.94931f)
        curveTo(3.00096f, 7.42525f, 3.00069f, 7.99289f, 3.00013f, 9.12817f)
        lineTo(3f, 13.8829f)
        curveTo(3f, 17.7094f, 3f, 19.6226f, 4.17157f, 20.8113f)
        curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8113f)
        curveTo(21f, 19.6226f, 21f, 17.7094f, 21f, 13.8829f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 13f)
        horizontalLineTo(8f)
        moveTo(16f, 13f)
        horizontalLineTo(14f)
        moveTo(10f, 9f)
        horizontalLineTo(8f)
        moveTo(10f, 17f)
        horizontalLineTo(8f)
        moveTo(16f, 9f)
        horizontalLineTo(14f)
        moveTo(16f, 17f)
        horizontalLineTo(14f)
        }
        }.build()

        return _departement!!
    }

private var _departement: ImageVector? = null
