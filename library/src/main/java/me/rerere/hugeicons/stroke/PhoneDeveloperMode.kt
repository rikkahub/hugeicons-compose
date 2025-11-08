package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PhoneDeveloperMode: ImageVector
    get() {
        if (_phoneDeveloperMode != null) {
            return _phoneDeveloperMode!!
        }
        _phoneDeveloperMode = ImageVector.Builder(
            name = "PhoneDeveloperMode",
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
        moveTo(18.5f, 7f)
        curveTo(18.5f, 4.64298f, 18.5f, 3.46447f, 17.7678f, 2.73223f)
        curveTo(17.0355f, 2f, 15.857f, 2f, 13.5f, 2f)
        horizontalLineTo(10.5f)
        curveTo(8.14298f, 2f, 6.96447f, 2f, 6.23223f, 2.73223f)
        curveTo(5.5f, 3.46447f, 5.5f, 4.64298f, 5.5f, 7f)
        moveTo(18.5f, 17f)
        curveTo(18.5f, 19.357f, 18.5f, 20.5355f, 17.7678f, 21.2678f)
        curveTo(17.0355f, 22f, 15.857f, 22f, 13.5f, 22f)
        horizontalLineTo(10.5f)
        curveTo(8.14298f, 22f, 6.96447f, 22f, 6.23223f, 21.2678f)
        curveTo(5.5f, 20.5355f, 5.5f, 19.357f, 5.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 2f)
        horizontalLineTo(10f)
        lineTo(10.5f, 3f)
        horizontalLineTo(13.5f)
        lineTo(14f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 15.5f)
        curveTo(15.5f, 15.5f, 18.9999f, 12.9223f, 18.9999f, 12f)
        curveTo(18.9999f, 11.0777f, 15.4999f, 8.50003f, 15.4999f, 8.50003f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.50003f, 15.5f)
        curveTo(8.50003f, 15.5f, 5.00007f, 12.9223f, 5.00006f, 12f)
        curveTo(5.00005f, 11.0777f, 8.50006f, 8.5f, 8.50006f, 8.5f)
        }
        }.build()

        return _phoneDeveloperMode!!
    }

private var _phoneDeveloperMode: ImageVector? = null
