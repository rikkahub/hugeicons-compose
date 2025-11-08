package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneyReceiveCircle: ImageVector
    get() {
        if (_moneyReceiveCircle != null) {
            return _moneyReceiveCircle!!
        }
        _moneyReceiveCircle = ImageVector.Builder(
            name = "MoneyReceiveCircle",
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
        moveTo(14f, 2.22179f)
        curveTo(13.3538f, 2.09076f, 12.6849f, 2.02197f, 12f, 2.02197f)
        curveTo(6.47715f, 2.02197f, 2f, 6.49421f, 2f, 12.011f)
        curveTo(2f, 17.5277f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5277f, 22f, 12.011f)
        curveTo(22f, 11.3269f, 21.9311f, 10.6587f, 21.8f, 10.0132f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9.01428f)
        curveTo(10.8954f, 9.01428f, 10f, 9.68512f, 10f, 10.5126f)
        curveTo(10f, 11.3401f, 10.8954f, 12.011f, 12f, 12.011f)
        curveTo(13.1046f, 12.011f, 14f, 12.6819f, 14f, 13.5093f)
        curveTo(14f, 14.3368f, 13.1046f, 15.0077f, 12f, 15.0077f)
        moveTo(12f, 9.01428f)
        curveTo(12.8708f, 9.01428f, 13.6116f, 9.43123f, 13.8862f, 10.0132f)
        moveTo(12f, 9.01428f)
        verticalLineTo(8.01538f)
        moveTo(12f, 15.0077f)
        curveTo(11.1292f, 15.0077f, 10.3884f, 14.5908f, 10.1138f, 14.0088f)
        moveTo(12f, 15.0077f)
        verticalLineTo(16.0066f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9951f, 2f)
        lineTo(17.8193f, 6.17362f)
        moveTo(16.9951f, 2.52119f)
        lineTo(17.1133f, 5.60928f)
        curveTo(17.1133f, 6.33713f, 17.5484f, 6.79062f, 18.3409f, 6.84782f)
        lineTo(21.465f, 6.99451f)
        }
        }.build()

        return _moneyReceiveCircle!!
    }

private var _moneyReceiveCircle: ImageVector? = null
