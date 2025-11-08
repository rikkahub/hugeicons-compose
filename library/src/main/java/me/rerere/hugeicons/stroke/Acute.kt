package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Acute: ImageVector
    get() {
        if (_acute != null) {
            return _acute!!
        }
        _acute = ImageVector.Builder(
            name = "Acute",
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
        moveTo(10.5958f, 2.52324f)
        curveTo(11.3962f, 2.29824f, 13.2718f, 1.82324f, 13.7721f, 2.07324f)
        moveTo(13.7721f, 2.07324f)
        curveTo(14.2973f, 2.39824f, 14.3973f, 4.14824f, 14.5475f, 4.87324f)
        moveTo(13.7721f, 2.07324f)
        lineTo(3.81773f, 18.1732f)
        curveTo(3.81773f, 18.1732f, 3.29249f, 19.0232f, 3.59264f, 19.4982f)
        curveTo(3.81774f, 20.0232f, 5.11831f, 19.9982f, 5.11831f, 19.9982f)
        horizontalLineTo(20.5f)
        moveTo(20.5f, 19.9982f)
        curveTo(20.5f, 19.3982f, 18.6992f, 18.1982f, 18.5241f, 17.9982f)
        moveTo(20.5f, 19.9982f)
        curveTo(20.5f, 20.5982f, 19.0494f, 21.4482f, 18.5241f, 21.9982f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.49414f, 12.498f)
        curveTo(9.36996f, 12.823f, 10.8049f, 13.723f, 11.6553f, 15.048f)
        curveTo(12.6057f, 16.398f, 12.7214f, 18.273f, 12.1462f, 19.798f)
        }
        }.build()

        return _acute!!
    }

private var _acute: ImageVector? = null
