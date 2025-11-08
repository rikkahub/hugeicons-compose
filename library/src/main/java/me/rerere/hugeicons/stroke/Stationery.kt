package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stationery: ImageVector
    get() {
        if (_stationery != null) {
            return _stationery!!
        }
        _stationery = ImageVector.Builder(
            name = "Stationery",
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
        moveTo(21f, 17.4f)
        curveTo(21f, 19.0971f, 21f, 19.9456f, 20.3491f, 20.4728f)
        curveTo(19.6983f, 21f, 18.6507f, 21f, 16.5556f, 21f)
        horizontalLineTo(15.4444f)
        curveTo(13.3493f, 21f, 12.3017f, 21f, 11.6509f, 20.4728f)
        curveTo(11f, 19.9456f, 11f, 19.0971f, 11f, 17.4f)
        lineTo(11f, 6.6f)
        curveTo(11f, 4.90294f, 11f, 4.05442f, 11.6509f, 3.52721f)
        curveTo(12.3017f, 3f, 13.3493f, 3f, 15.4444f, 3f)
        lineTo(16.5556f, 3f)
        curveTo(18.6507f, 3f, 19.6983f, 3f, 20.3491f, 3.52721f)
        curveTo(21f, 4.05442f, 21f, 4.90294f, 21f, 6.6f)
        lineTo(21f, 17.4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 5.04096f)
        curveTo(3f, 4.07884f, 3f, 3.59778f, 3.29289f, 3.29889f)
        curveTo(3.58579f, 3f, 4.05719f, 3f, 5f, 3f)
        curveTo(5.94281f, 3f, 6.41421f, 3f, 6.70711f, 3.29889f)
        curveTo(7f, 3.59778f, 7f, 4.07884f, 7f, 5.04096f)
        lineTo(7f, 15.8877f)
        curveTo(7f, 16.7952f, 7f, 17.2489f, 6.92429f, 17.6878f)
        curveTo(6.855f, 18.0895f, 6.73877f, 18.4813f, 6.57807f, 18.8547f)
        curveTo(6.40249f, 19.2628f, 6.15585f, 19.6403f, 5.66258f, 20.3954f)
        curveTo(5.44279f, 20.7318f, 5.33289f, 20.9f, 5.19487f, 20.9597f)
        curveTo(5.0703f, 21.0134f, 4.9297f, 21.0134f, 4.80513f, 20.9597f)
        curveTo(4.66711f, 20.9f, 4.55721f, 20.7318f, 4.33742f, 20.3954f)
        curveTo(3.84415f, 19.6403f, 3.59751f, 19.2628f, 3.42193f, 18.8548f)
        curveTo(3.26123f, 18.4813f, 3.14499f, 18.0895f, 3.07571f, 17.6878f)
        curveTo(3f, 17.2489f, 3f, 16.7952f, 3f, 15.8877f)
        lineTo(3f, 5.04096f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 16.5f)
        lineTo(13.5f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 12f)
        lineTo(13.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 7.5f)
        lineTo(13.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        curveTo(7f, 7.55228f, 6.10457f, 8f, 5f, 8f)
        curveTo(3.89543f, 8f, 3f, 7.55228f, 3f, 7f)
        }
        }.build()

        return _stationery!!
    }

private var _stationery: ImageVector? = null
