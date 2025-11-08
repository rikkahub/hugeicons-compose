package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UniversalAccessCircle: ImageVector
    get() {
        if (_universalAccessCircle != null) {
            return _universalAccessCircle!!
        }
        _universalAccessCircle = ImageVector.Builder(
            name = "UniversalAccessCircle",
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
        moveTo(12f, 7.5f)
        curveTo(12.4142f, 7.5f, 12.75f, 7.16421f, 12.75f, 6.75f)
        curveTo(12.75f, 6.33579f, 12.4142f, 6f, 12f, 6f)
        moveTo(12f, 7.5f)
        curveTo(11.5858f, 7.5f, 11.25f, 7.16421f, 11.25f, 6.75f)
        curveTo(11.25f, 6.33579f, 11.5858f, 6f, 12f, 6f)
        moveTo(12f, 7.5f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 9f)
        curveTo(14.9691f, 9.61859f, 13.5573f, 10f, 12f, 10f)
        curveTo(10.4427f, 10f, 9.03086f, 9.61859f, 8f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 14f)
        lineTo(14f, 18f)
        moveTo(13f, 14f)
        verticalLineTo(10f)
        moveTo(13f, 14f)
        horizontalLineTo(12f)
        moveTo(10f, 18f)
        lineTo(11f, 14f)
        moveTo(11f, 14f)
        verticalLineTo(10f)
        moveTo(11f, 14f)
        horizontalLineTo(12f)
        moveTo(12f, 14f)
        verticalLineTo(10f)
        }
        }.build()

        return _universalAccessCircle!!
    }

private var _universalAccessCircle: ImageVector? = null
