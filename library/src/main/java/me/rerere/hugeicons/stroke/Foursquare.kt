package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Foursquare: ImageVector
    get() {
        if (_foursquare != null) {
            return _foursquare!!
        }
        _foursquare = ImageVector.Builder(
            name = "Foursquare",
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
        moveTo(15.8989f, 2f)
        horizontalLineTo(7.71957f)
        curveTo(6.43755f, 2f, 5.79654f, 2f, 5.39827f, 2.4282f)
        curveTo(5f, 2.8564f, 5f, 3.54557f, 5f, 4.92392f)
        verticalLineTo(16.7262f)
        curveTo(5f, 19.9619f, 5f, 21.5797f, 5.87654f, 21.938f)
        curveTo(6.75308f, 22.2963f, 7.75279f, 21.0872f, 9.75219f, 18.6688f)
        lineTo(11.7113f, 16.2992f)
        curveTo(11.9776f, 15.9771f, 12.1107f, 15.816f, 12.2879f, 15.7305f)
        curveTo(12.4651f, 15.645f, 12.6655f, 15.645f, 13.0664f, 15.645f)
        horizontalLineTo(13.1431f)
        curveTo(14.4596f, 15.645f, 15.1178f, 15.645f, 15.6025f, 15.2519f)
        curveTo(16.0872f, 14.8588f, 16.268f, 14.1784f, 16.6297f, 12.8174f)
        lineTo(18.5139f, 5.72719f)
        curveTo(18.9681f, 4.01783f, 19.1952f, 3.16315f, 18.7872f, 2.58158f)
        curveTo(18.3792f, 2f, 17.5524f, 2f, 15.8989f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 9f)
        lineTo(12f, 9f)
        }
        }.build()

        return _foursquare!!
    }

private var _foursquare: ImageVector? = null
