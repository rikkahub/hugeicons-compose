package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hangout: ImageVector
    get() {
        if (_hangout != null) {
            return _hangout!!
        }
        _hangout = ImageVector.Builder(
            name = "Hangout",
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
        moveTo(12f, 22f)
        curveTo(16f, 22f, 21f, 16f, 21f, 11f)
        curveTo(21f, 6f, 16.9706f, 2f, 12f, 2f)
        curveTo(7.02944f, 2f, 3f, 6f, 3f, 11f)
        curveTo(3f, 16f, 7.02944f, 20f, 12f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 11.5f)
        verticalLineTo(10f)
        curveTo(10.5f, 9.05719f, 10.5f, 8.58579f, 10.2071f, 8.29289f)
        curveTo(9.91421f, 8f, 9.44281f, 8f, 8.5f, 8f)
        curveTo(7.55719f, 8f, 7.08579f, 8f, 6.79289f, 8.29289f)
        curveTo(6.5f, 8.58579f, 6.5f, 9.05719f, 6.5f, 10f)
        verticalLineTo(10.5f)
        curveTo(6.5f, 10.9659f, 6.5f, 11.1989f, 6.57612f, 11.3827f)
        curveTo(6.67761f, 11.6277f, 6.87229f, 11.8224f, 7.11732f, 11.9239f)
        curveTo(7.30109f, 12f, 7.8312f, 12f, 8.29714f, 12f)
        curveTo(8.51058f, 12.9056f, 8f, 14f, 8f, 14f)
        curveTo(9.38071f, 14f, 10.5f, 12.8807f, 10.5f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 11.5f)
        verticalLineTo(10f)
        curveTo(17.5f, 9.05719f, 17.5f, 8.58579f, 17.2071f, 8.29289f)
        curveTo(16.9142f, 8f, 16.4428f, 8f, 15.5f, 8f)
        curveTo(14.5572f, 8f, 14.0858f, 8f, 13.7929f, 8.29289f)
        curveTo(13.5f, 8.58579f, 13.5f, 9.05719f, 13.5f, 10f)
        verticalLineTo(10.5f)
        curveTo(13.5f, 10.9659f, 13.5f, 11.1989f, 13.5761f, 11.3827f)
        curveTo(13.6776f, 11.6277f, 13.8723f, 11.8224f, 14.1173f, 11.9239f)
        curveTo(14.3011f, 12f, 14.8312f, 12f, 15.2971f, 12f)
        curveTo(15.5106f, 12.9056f, 15f, 14f, 15f, 14f)
        curveTo(16.3807f, 14f, 17.5f, 12.8807f, 17.5f, 11.5f)
        }
        }.build()

        return _hangout!!
    }

private var _hangout: ImageVector? = null
