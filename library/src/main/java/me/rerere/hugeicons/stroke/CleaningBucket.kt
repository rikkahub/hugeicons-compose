package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CleaningBucket: ImageVector
    get() {
        if (_cleaningBucket != null) {
            return _cleaningBucket!!
        }
        _cleaningBucket = ImageVector.Builder(
            name = "CleaningBucket",
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
        moveTo(11f, 9f)
        horizontalLineTo(19.9948f)
        curveTo(20.4907f, 9f, 20.7387f, 9f, 20.8843f, 9.16028f)
        curveTo(21.0299f, 9.32055f, 21.0108f, 9.57261f, 20.9728f, 10.0767f)
        lineTo(20.3518f, 18.3068f)
        curveTo(20.2196f, 20.0588f, 20.1535f, 20.9349f, 19.5893f, 21.4674f)
        curveTo(19.0252f, 22f, 18.1633f, 22f, 16.4396f, 22f)
        horizontalLineTo(11.9354f)
        curveTo(10.2116f, 22f, 9.34972f, 22f, 8.78559f, 21.4674f)
        curveTo(7.94616f, 20.675f, 8.08069f, 19.0693f, 8f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 8.90909f)
        verticalLineTo(14.3636f)
        curveTo(11f, 16.0778f, 11f, 16.9349f, 10.4142f, 17.4675f)
        curveTo(9.82843f, 18f, 8.88562f, 18f, 7f, 18f)
        curveTo(5.11438f, 18f, 4.17157f, 18f, 3.58579f, 17.4675f)
        curveTo(3f, 16.9349f, 3f, 16.0778f, 3f, 14.3636f)
        verticalLineTo(13.4545f)
        curveTo(3f, 10.8832f, 3f, 9.5976f, 3.87868f, 8.7988f)
        curveTo(4.75736f, 8f, 6.17157f, 8f, 9f, 8f)
        horizontalLineTo(10f)
        curveTo(10.4714f, 8f, 10.7071f, 8f, 10.8536f, 8.13313f)
        curveTo(11f, 8.26627f, 11f, 8.48054f, 11f, 8.90909f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 9f)
        curveTo(19f, 5.13401f, 16.75f, 2f, 13.9746f, 2f)
        curveTo(11.4428f, 2f, 9.34836f, 4.60771f, 9f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 14f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 13f)
        horizontalLineTo(20f)
        }
        }.build()

        return _cleaningBucket!!
    }

private var _cleaningBucket: ImageVector? = null
